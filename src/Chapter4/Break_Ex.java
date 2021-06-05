package Chapter4;

public class Break_Ex {

	public static void main(String[] args) {
		//1부터 계속 더할때 100이 넘는 순간의 num의 값을 구하기
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100)
				break;
			num++;
		}
		
		System.out.println(sum); //105
		System.out.println(num); //14

	}

}
