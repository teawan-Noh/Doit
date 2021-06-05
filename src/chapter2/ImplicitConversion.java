package chapter2;

public class ImplicitConversion {//형 변환(type  conversion)
					
	public static void main(String[] args) {
		//묵시적 형변환
		//정수
		//byte -> short/char -> int -> long
		//1바이트	  2바이트 		4바이트  8바이트
		
		//실수
		//float -> double
		//4바이트    8바이트
		byte bNum = 10;
		int  num = bNum;  //작은수에서 큰수
		
		System.out.println(num); //10
		
		long lNum = 10;
		float fNum = lNum;  //덜 정밀한 수에서 더 정밀한 수
		
		System.out.println(fNum); //10.0
		
		double dNum = fNum + num;
		System.out.println(dNum); //20.0
		
		
		
	}

}
