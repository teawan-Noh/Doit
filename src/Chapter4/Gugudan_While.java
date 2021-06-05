package Chapter4;

public class Gugudan_While {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		while(dan <= 9) {
			times = 1; // times ÃÊ±âÈ­
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}

	}

}
