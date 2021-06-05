package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		//단락회로 평가
		// 논리곱(&&)에서 앞 항의 결과 값이 거짓이면 뒷 항은 실행되지 않음
		// 논리합(||)에서 앞 항의 결과 값이 참이면 뒷 항은 실행되지 않음
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( ((num1 = num1 + 10) < 10) &&((i = i +2) > 10) );
		System.out.println(value); //false
		System.out.println(num1);  //20
		System.out.println(i);     //2  앞의 항이 false 이므로 뒷 항은 실행되지 않음

	}

}
