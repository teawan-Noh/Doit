package Chapter7;

public class ArrayTest {//���� �迭

	public static void main(String[] args) {
		
		//int[] numbers = new int[] {0, 1, 2}; //�迭 �ʱ�ȭ: []�� ���� {}���� ä��� �ʱ�ȭ
		
		int[] numbers = new int[3];
		
		numbers[0] = 1; //numbers �迭�� ù��°�ڸ�
		numbers[1] = 2; //numbers �迭�� �ι�°�ڸ�
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] studentIDs = new int[5];
		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]); //int �� 0, double�� 0.0
		}

	}

}