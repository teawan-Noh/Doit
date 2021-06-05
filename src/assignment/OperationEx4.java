package assignment;

public class OperationEx4 {

	public static void main(String[] args) {
		//복합 대입 연산자
		// '+='  :  num1 += 2;
		//          num1 = num1 + 2;와 같다

		
		int num1 = 10;
		System.out.println(num1 += 1); //11
		
		System.out.println(num1 %= 10);//1
		
		num1 -= 1; // num1 = num1 -1;
		System.out.println(num1); //0
		
		//조건연산자
		int num = (5 > 3) ? 10:20;
		System.out.println(num); //10
		
		int num5 = (5 < 3) ? 10:20;
		System.out.println(num5); //20
		
	}

}
