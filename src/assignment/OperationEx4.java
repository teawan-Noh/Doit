package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		//���� ���� ������
		// '+='  :  num1 += 2;
		//          num1 = num1 + 2;�� ����

		
		int num1 = 10;
		System.out.println(num1 += 1); //11
		
		System.out.println(num1 %= 10);//1
		
		num1 -= 1; // num1 = num1 -1;
		System.out.println(num1); //0
		
		//���ǿ�����
		int num = (5 > 3) ? 10:20;
		System.out.println(num); //10
		
		int num5 = (5 < 3) ? 10:20;
		System.out.println(num5); //20
		
	}

}
