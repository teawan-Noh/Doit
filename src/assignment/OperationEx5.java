package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		// ��Ʈ������
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 | num2 ;
		System.out.println(result); //15
		
		int num3 = 5; //00000101;
		System.out.println(num3 << 1); //10 ���� shift �и���ŭ 2��n��
		System.out.println(num3 << 2); //20 ���� shift �и���ŭ 2��n��
		System.out.println(num3 << 3); //40 ���� shift �и���ŭ 2��n��
		
		System.out.println(num3 >> 1); //2  00000010;

	}

}
