package com.claim;

import java.util.Scanner;

import javax.swing.text.Position;

public class Application 
{
	

	public static void main(String[] args) 
	{

		main();
	}

	public static void main() {
		
	
				
		Scanner in = new Scanner(System.in);
		System.out.println("Choose an Option 1-7" +						 
			"\n"+	"1. Add contact" + 
			"\n"+	"2. Display Contact" + 
			"\n"+	"3. Searchby First Name" + 
			"\n"+	"4. Searchby Last Name" +
			"\n"+ 	"5. Update Phone Number" + 
			"\n"+ 	"6. Delete" + 
			"\n"+ 	"7. Exit"
						);
					
			int choice = in.nextInt();
			switch (choice) 
			{
			case 1:addContact();
					main();
					break;

			case 2:	displayContact();
			main();
					break;

			case 3: SearchByFirstName();
			main();
					break;
				
			case 4:	SearchByLastName();
			main();
					break;

			case 5:	UpdatePhoneNo();
			main();
					break;

			case 6:	Delete();
			main();
					break;

			case 7: Exit();
			main();
					break;
				
				default:
				System.out.println("invalid choice !");
				main();
				break;
			
			}
		
	}
	
	public static void addContact() {
	System.out.println("Add contact");
	Scanner in = new Scanner (System.in);
	String sc = in.nextLine();
	
		String []info = sc.split(", ");
		
		String names = info[0];
		String street = info[1];
		String city = info[2];
		String state = info[3];
		String zipCode = info[4];
		String phoneNumber = info[5];
		
		String [] wholename = names.split(" ");
		if(wholename.length<2) {
			System.out.println("Invalid name");
			return;
		}
		
		String firstName = wholename[0];
		String lastName= wholename[wholename.length-1];
		String middleName ="";
		
		if(wholename.length>2) {
			for(int i=1; i<wholename.length-1; i++) {
				middleName = middleName + wholename[i] + " ";
			}
			middleName = middleName.substring(0, middleName.length()-1);
		}
		

		
		
		Address address = new Address(street, city, state, zipCode);
		Person person = new Person (firstName, middleName, lastName, address, phoneNumber);
		
			expandArray(person);
	}	
	
	
	public static int currentEntry = 0;
	public static int currentInt = 20;
	public static Person[] people = new Person[3];
	
	public static Person [] expandArray(Person person) {
		people [currentEntry] = person;
		currentEntry++;
		return people;
	}
	
	public static void SearchByFirstName() {
		System.out.println("Enter First Name");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		
		for(Person person : people) {
			if(person!=null && firstName.equals(person.getFirstName())) {
				System.out.println(person);
			}
		}

	}
	
	public static void SearchByLastName() {
		System.out.println("Enter Last Name");
		Scanner in = new Scanner(System.in);
		String lastName = in.nextLine();
		
		for(Person person : people) {
			if(person!=null && lastName.equals(person.getLastName())) {
				System.out.println(person);
	}
		}
	}
	
	public static void UpdatePhoneNo() {
		System.out.println("Enter a Phone Number");
		
		Scanner in = new Scanner(System.in);
		String phNumber = in.nextLine();
		for(Person person : people) {
			if(person!=null && phNumber.equals(person.getPhoneNumber())) {
				//Get new phone number
				System.out.println("Enter a Phone Number to update");
				String newphNumber = in.nextLine();
				person.setPhoneNumber(newphNumber);
				
				System.out.println("Phone number updated");
			}

		}	
	}

	
	public static void Delete() {
	
		System.out.println("Enter a Phone Number");
		Person []tempPersons = new Person[3];
		Scanner in = new Scanner(System.in);
		String phNumber = in.nextLine();
		int pos=0;
		for(Person person : people) {
			if(person!=null && phNumber.equals(person.getPhoneNumber())) {
				System.out.println("Account deleted");
				currentEntry--;
			}
			else
			{
				tempPersons[pos]=person;
				pos++;
			}

		}	
		people = tempPersons;
		
		
	}
	
		

	public static void Exit() {
		System.out.println("Bye");
		System.exit(currentEntry);
		
		
	}
	
	public static void displayContact() {
		for (Person person : people) {
			if(person!=null)
				System.out.println(person);
		
		
	}
			
	}

	}
