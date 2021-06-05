package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		//����� �� ��ȯ
		
		int iNum = 1000;
		byte bNum = (byte) iNum;
		
		System.out.println(iNum); //1000
		System.out.println(bNum); //-24  ū������ ����������  ����ȯ�� �ϸ� ������ ������ �Ͼ��
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //3  �Ҽ������ڸ� ����
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //3+0
		int num2 = (int)(dNum + fNum);	  //4.04 ����ȯ-> 4
		
		System.out.println(num1); //3
		System.out.println(num2); //4
		

	}

}
