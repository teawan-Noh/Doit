package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korea; //Subject class 참조
	Subject math;
	
	public Student() {
		korea = new Subject("국어"); //각 과목에 대한 인스턴스 생성
		math = new Subject("수학");
	}
	
	//student를 만들떄 id와 name을 받고 싶을 경우 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어"); 
		math = new Subject("수학");
		}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다." );
	}
}

