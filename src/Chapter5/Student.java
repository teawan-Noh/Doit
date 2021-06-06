package Chapter5; //class part

public class Student {
	//멤버변수
	int studentID;
	String studentName;
	int age;
	String address;
	
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
}
