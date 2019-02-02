package Entyties;

public class Student {

	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void studentInit(){
		System.out.println("The init method has been called.....");
	}
	
	public void studentDestroy(){
		System.out.println("The destroy method has been called......");
	}

}
