package Chapter5;

public class StudentTest {

	public static void main(String[] args) {
		
	//������������Ÿ��, ��������
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "�Ⱦ翪";
		
		Student studentKim = new Student();
		studentKim.studentName = "�̼���";
		studentKim.studentID = 101;
		studentKim.address = "�̱�";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
