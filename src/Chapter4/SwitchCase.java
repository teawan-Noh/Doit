package Chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		int rank = 1;
		char medalcolor;
		
		switch(rank) {
			case 1: medalcolor = 'G';
					break;
			case 2: medalcolor = 'S';
					break;
			case 3: medalcolor = 'B';
					break;
			default: medalcolor = 'A';
		}
		System.out.println(rank + "�� �޴��� ������ " + medalcolor + "�Դϴ�");
	}

}
