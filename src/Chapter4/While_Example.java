package Chapter4;

public class While_Example {

	public static void main(String[] args) {
		//while��: �ϳ��� ���ǿ� ���� �ݺ������� �̷������ ���
		//������ ���� ������ ���๮�� ������� ����
		//�ַ� ���ǽ��� true, false�� ��Ÿ��
		
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			
			sum += num;  // sum = sum + num;
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum +"�Դϴ�" );
		//sum = 55
	}

}


