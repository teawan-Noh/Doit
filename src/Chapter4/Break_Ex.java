package Chapter4;

public class Break_Ex {

	public static void main(String[] args) {
		//1���� ��� ���Ҷ� 100�� �Ѵ� ������ num�� ���� ���ϱ�
		
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
