package com.claim;

public class Person extends Address {
	
 private String firstName;
 private String middleName;
 private String lastName;
 
 public String getMiddleName() {
	return middleName;
}

public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

private Address address;
 private String phoneNumber;
 
	 
 

public Person(String firstName, String middleName, String lastName,  Address address, String phoneNumber) {
	
	this.firstName = firstName;
	this.middleName= middleName;
	this.lastName = lastName;
	this.address = address;
	this.phoneNumber = phoneNumber;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@Override
public String toString() {
	return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber + "]";
}

public static Object getUpdate() {
	// TODO Auto-generated method stub
	return null;
}



 
 
}
