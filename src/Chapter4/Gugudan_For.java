package Chapter4;

public class Gugudan_For {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for(dan = 1; dan <= 9; dan++) {
			
			for(times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();  //���� ����
		}

	}

}
