package singletone;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();

		Company c2 = Company.getInstance();
		
		System.out.println(c1); //singletone.Company@5ca881b5
		System.out.println(c2); //singletone.Company@5ca881b5
		
		Calendar cal = Calendar.getInstance();
		//캘린더도 싱글톤으로 제공
		//인스턴스가 여러개를 만들필요가 없거나 여러개를 만들면 문제가될때 싱글톤 사용
	}

}
