package singletone;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();

		Company c2 = Company.getInstance();
		
		System.out.println(c1); //singletone.Company@5ca881b5
		System.out.println(c2); //singletone.Company@5ca881b5
		
		Calendar cal = Calendar.getInstance();
		//Ķ������ �̱������� ����
		//�ν��Ͻ��� �������� �����ʿ䰡 ���ų� �������� ����� �������ɶ� �̱��� ���
	}

}
