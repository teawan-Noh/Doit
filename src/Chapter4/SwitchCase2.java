package Chapter4;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int rank = a;
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
