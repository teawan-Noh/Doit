package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		//명시적 형 변환
		
		int iNum = 1000;
		byte bNum = (byte) iNum;
		
		System.out.println(iNum); //1000
		System.out.println(bNum); //-24  큰값에서 작은값으로  형변환을 하면 데이터 유실이 일어난다
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //3  소수점뒷자리 유실
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum; //3+0
		int num2 = (int)(dNum + fNum);	  //4.04 형변환-> 4
		
		System.out.println(num1); //3
		System.out.println(num2); //4
		

	}

}
