package Entyties;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private String studentName;

	@Autowired
	private Address address;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void showInfo(){
		System.out.println("The address is " + address.getAddress());
	}

}
