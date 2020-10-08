# Lab A 

## Week 1, Day 4 
## by Janine Parham 

### Class 1
``` java
package com.overloading.assign;

public class ConstructorOne {
	public String firstName;
	public String lastName;
	public int age;
	public int phoneNumber;
	
	public ConstructorOne() {
		this.firstName = "NEW CONTACT";
	}
	
	public ConstructorOne(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public ConstructorOne(String firstName, String lastName, int age, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Fullname: \"" + this.firstName + " " + this.lastName + "\" Age: \"" + this.age + "\" Contact: \"" + this.phoneNumber + "\"";
	}
}
```

### Class 2
```java
package com.overloading.assign;

import java.util.ArrayList;

public class Contact {
	public String company;
	public ArrayList<ConstructorOne> contactList;
	
	public Contact() {
		
	}
	
	public Contact(String company) {
		this.company = company;
		this.contactList = new ArrayList<>();
	}
	
	public void createContact(ConstructorOne contact) {
		this.contactList.add(contact);
	}
	
	@Override
	public String toString() {
		return "Contact List: " + this.contactList;
	}
}
```
