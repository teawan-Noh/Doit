package Chapter5;

public class StudentTest {

	public static void main(String[] args) {
		
	//참조형데이터타입, 참조변수
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "안양역";
		
		Student studentKim = new Student();
		studentKim.studentName = "이순박";
		studentKim.studentID = 101;
		studentKim.address = "미국";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
