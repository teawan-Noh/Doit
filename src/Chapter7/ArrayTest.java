package Chapter7;

public class ArrayTest {//정수 배열

	public static void main(String[] args) {
		
		//int[] numbers = new int[] {0, 1, 2}; //배열 초기화: []를 비우고 {}안을 채우면 초기화
		
		int[] numbers = new int[3];
		
		numbers[0] = 1; //numbers 배열의 첫번째자리
		numbers[1] = 2; //numbers 배열의 두번째자리
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] studentIDs = new int[5];
		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]); //int 는 0, double은 0.0
		}

	}

}