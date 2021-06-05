package Chapter4;

public class Do_WhileEx {

	public static void main(String[] args) {
			//do-while문: 먼저 수행문을 한 번 수행하고 조건식 체크
			//수행문이 반드시 한 번 이상 수행 되어야 하는 경우 사용
			
			int num = 1;
			int sum = 0;
			
			do {
				sum += num;  // sum = sum + num;
				num++;
			}while(num < 1);
			
			System.out.println("1부터 10까지의 합은 " + sum +"입니다" );
			// sum = 1;
	}

}
