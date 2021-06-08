package Chapter7;

public class ArrayTest2 { //실수 배열

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		for(int i = 0; i < size; i++ ) { //곱셈은 배열에 비어있는 곳이 0이 곱해져 0이나오므로 size를 만들어 생성해줌
			total *= num[i];
		}
		
		System.out.println(total);
	}

}
