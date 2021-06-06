package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentJames = new Student(100, "James");
		studentJames.setKorea(100);
		studentJames.setMath(100);

		Student studentTomas = new Student(100, "Tomas");
		studentTomas.setKorea(90);
		studentTomas.setMath(90);
		
		studentJames.showStudentInfo(); //James학생의 총점은 200점 입니다.
		studentTomas.showStudentInfo(); //Tomas학생의 총점은 180점 입니다.
	}

}
