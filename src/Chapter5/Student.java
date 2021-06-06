package Chapter5; //class part

public class Student {
	//멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		
	}
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
}
