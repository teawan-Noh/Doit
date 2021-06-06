package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korea; //Subject class ����
	Subject math;
	
	public Student() {
		korea = new Subject("����"); //�� ���� ���� �ν��Ͻ� ����
		math = new Subject("����");
	}
	
	//student�� ���鋚 id�� name�� �ް� ���� ��� 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("����"); 
		math = new Subject("����");
		}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�." );
	}
}
