package Chapter4;

public class Do_WhileEx {

	public static void main(String[] args) {
			//do-while��: ���� ���๮�� �� �� �����ϰ� ���ǽ� üũ
			//���๮�� �ݵ�� �� �� �̻� ���� �Ǿ�� �ϴ� ��� ���
			
			int num = 1;
			int sum = 0;
			
			do {
				sum += num;  // sum = sum + num;
				num++;
			}while(num < 1);
			
			System.out.println("1���� 10������ ���� " + sum +"�Դϴ�" );
			// sum = 1;
	}

}
