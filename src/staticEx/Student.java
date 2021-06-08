package staticEx;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //지역변수
		
		//studentName = "홍길동" //멤버변수, 인스턴스 변수
							 //인스턴스가 new될때 생성되지만
							//static변수에서 인스턴스가 생성되기 전에 사용될 수 있으로
							//static변수에서는 생성이 불확실한 인스턴스 변수를 사용할 수 없음
		
		return serialNum;  //static변수, 클래스 변수
	}

	
	
	
}
