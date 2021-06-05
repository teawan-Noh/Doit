package Chapter4;

public class Continue_Ex {

	public static void main(String[] args) {
		// 짝수만 더하기

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) { //100까지 반복
			
			if( (num % 2) == 1) {		//num 값이 홀수인 경우
				continue;				//이후 수행을 생략하고 num++ 수행
			}
			total += num;				//num 값이 짝수인 경우에만 수행
		}
		System.out.println(total); //2550
	
		
	}

}
