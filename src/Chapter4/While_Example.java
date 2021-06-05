package Chapter4;

public class While_Example {

	public static void main(String[] args) {
		//while문: 하나의 조건에 대해 반복수행이 이루어질때 사용
		//조건이 맞지 않으면 수행문이 수행되지 않음
		//주로 조건식이 true, false로 나타남
		
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			
			sum += num;  // sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum +"입니다" );
		//sum = 55
	}

}


