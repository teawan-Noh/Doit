package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		System.out.println(Student.getSerialNum());
		

		Student james = new Student();
		System.out.println(james.getSerialNum());

		
		Student jon = new Student();
		System.out.println(jon.studentID);
	}

}
