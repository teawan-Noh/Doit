package Chapter4;

public class Continue_Ex {

	public static void main(String[] args) {
		// ¦���� ���ϱ�

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) { //100���� �ݺ�
			
			if( (num % 2) == 1) {		//num ���� Ȧ���� ���
				continue;				//���� ������ �����ϰ� num++ ����
			}
			total += num;				//num ���� ¦���� ��쿡�� ����
		}
		System.out.println(total); //2550
	
		
	}

}
