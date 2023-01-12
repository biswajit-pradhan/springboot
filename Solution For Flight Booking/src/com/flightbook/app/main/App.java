package com.flightbook.app.main;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.flightbook.app.model.Customer;
import com.flightbook.app.model.Flight;

public class App {

	public static void main(String[] args) {
		try {
			EntityManagerFactory entityAManageFactory = Persistence.createEntityManagerFactory("flightbooking");
			EntityManager entityManager = entityAManageFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			System.out.println("DATABASE SUCCESSFULLY CONNECTED");
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("-------SOLUTION FOR FLIGHT BOOKING-------");
				System.out.println("1. Insert Customer Record");
				System.out.println("2. Update Customer Record");
				System.out.println("3. Delete Customer Record");
				System.out.println("4. Display Records of Customer");
				System.out.println("5. Add Flight");
				System.out.println("6. Display All Flights for a Date");
				System.out.println("7. Display All Flights for a Destination");
				System.out.println("0. Exit");
				int input = scanner.nextInt();
				if (input == 0) {
					System.out.println("Exiting....Bye...");
					break;
				}
				Flight flight=new Flight();
				switch(input) {
				case 1:
					System.out.println("Insert Customer Data");
					System.out.println("Enter Customer Name: ");
					scanner.nextLine();
					String name=scanner.nextLine();
					System.out.println("Enter Contact ");
					String contact=scanner.next();
					System.out.println("Enter City ");
					String city=scanner.next();
					Customer customer=new Customer();//POJO:Plain Old Java Object
					customer.setName(name);
					customer.setContact(contact);
					customer.setCity(city);
					entityTransaction.begin();
					entityManager.persist(customer);
					entityTransaction.commit();
					System.out.println("Customer added to the DB...");
					break;
				case 2:
					System.out.println("Customer Updation");
					System.out.println("Enter Customer ID to update record");
					int id=scanner.nextInt();
					entityTransaction.begin();
					customer=entityManager.find(Customer.class, id);
					if(customer==null) {
						System.out.println("Customer with ID " +id+" does not exist");
					}
					else {
						System.out.println("Customer Details\n"+customer);
						System.out.println("Enter new values");
						System.out.println("Enter Customer Name: ");
						scanner.nextLine();
						name=scanner.nextLine();
						System.out.println("Enter Contact ");
						contact=scanner.next();
						System.out.println("Enter City ");
						city=scanner.next();
						customer.setName(name);
						customer.setContact(contact);
						customer.setCity(city);
						entityManager.persist(customer);
						System.out.println("Customer record updated in DB...");
					}
					entityTransaction.commit();
					break;
				case 3:
					System.out.println("Customer Deletion");
					System.out.println("Enter Customer ID to delete record");
					id=scanner.nextInt();
					entityTransaction.begin();
					customer=entityManager.find(Customer.class, id);
					if(customer==null) {
						System.out.println("Customer with ID " +id+" does not exist");
					}
					else {
						entityManager.remove(customer);
						System.out.println("Customer with ID "+id+" deleted from the DB");
					}
					entityTransaction.commit();
					break;
				case 4:
					System.out.println("Customer Records");
					entityTransaction.begin();
					List<Customer> list=entityManager.createQuery("select customer from Customer customer",Customer.class).getResultList();
					list.stream().forEach(System.out::println);
					entityTransaction.commit();
					break;
				case 5:
					System.out.println("Insert Flight Data");
					System.out.println("Enter Source Name: ");
					scanner.nextLine();
					String source=scanner.nextLine();
					System.out.println("Enter Destination Name ");
					String destination=scanner.nextLine();
					System.out.println("Enter Departure Date ");
					String d_date=scanner.next();
					System.out.println("Enter Fare");
					double fare=scanner.nextDouble();
					flight.setSource(source);
					flight.setDestination(destination);
					flight.setDepartureDate(d_date);
					flight.setFare(fare);
					entityTransaction.begin();
					entityManager.persist(flight);
					entityTransaction.commit();
					System.out.println("Flight added to the DB...");
					break;
				case 6:
					System.out.println("Display all flights for a Date");
					System.out.println("Enter Date");
					String date=scanner.next();
						entityTransaction.begin();
						List<Flight> list2=entityManager.createQuery("select f from Flight f",Flight.class).getResultList();
						list2.stream().filter(f->f.getDepartureDate().equalsIgnoreCase(date)).forEach(System.out::println);
						List<Flight> list3=list2.stream().filter(f->f.getDestination().equalsIgnoreCase(date)).collect(Collectors.toList());
						entityTransaction.commit();
						if(list3.isEmpty()) {
							System.out.println("Flights are not available on "+date);
						}
					break;
				case 7:
					System.out.println("Display all flights for a Destination");
					System.out.println("Enter Destination");
					String des=scanner.next();
						entityTransaction.begin();
						list2=entityManager.createQuery("select f from Flight f",Flight.class).getResultList();
						list2.stream().filter(f->f.getDestination().equalsIgnoreCase(des)).forEach(System.out::println);
						list3=list2.stream().filter(f->f.getDestination().equalsIgnoreCase(des)).collect(Collectors.toList());
						entityTransaction.commit();
						if(list3.isEmpty()) {
							System.out.println("Flights with "+des+" destination are not available");
						}
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}
			}
			scanner.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
