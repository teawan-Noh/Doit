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
		int i = 10; //��������
		
		//studentName = "ȫ�浿" //�������, �ν��Ͻ� ����
							 //�ν��Ͻ��� new�ɶ� ����������
							//static�������� �ν��Ͻ��� �����Ǳ� ���� ���� �� ������
							//static���������� ������ ��Ȯ���� �ν��Ͻ� ������ ����� �� ����
		
		return serialNum;  //static����, Ŭ���� ����
	}

	
	
	
}
