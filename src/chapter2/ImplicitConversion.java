package chapter2;

public class ImplicitConversion {//�� ��ȯ(type  conversion)
					
	public static void main(String[] args) {
		//������ ����ȯ
		//����
		//byte -> short/char -> int -> long
		//1����Ʈ	  2����Ʈ 		4����Ʈ  8����Ʈ
		
		//�Ǽ�
		//float -> double
		//4����Ʈ    8����Ʈ
		byte bNum = 10;
		int  num = bNum;  //���������� ū��
		
		System.out.println(num); //10
		
		long lNum = 10;
		float fNum = lNum;  //�� ������ ������ �� ������ ��
		
		System.out.println(fNum); //10.0
		
		double dNum = fNum + num;
		System.out.println(dNum); //20.0
		
		
		
	}

}
