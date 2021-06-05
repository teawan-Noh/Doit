package Chapter4;

public class For_Ex {

	public static void main(String[] args) {
		
		//for문: 수의 특정 범위, 횟수와 관련한 반복수행에서 주로 사용
		
		int num = 1;
		int sum = 0;
		
		for(num = 1; num <=10; num++) {
			
			sum += num;
			
		}
		System.out.println(sum); //55
		System.out.println(num); //11
	}

}
