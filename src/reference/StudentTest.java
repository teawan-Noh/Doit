package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(100);

		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea(90);
		studentTomas.setMath(90);
		
		studentJames.showStudentInfo(); //James�л��� ������ 200�� �Դϴ�.
		studentTomas.showStudentInfo(); //Tomas�л��� ������ 180�� �Դϴ�.
	}

}
