package Chapter7;

public class TowDimensionArray {//������ �迭

	public static void main(String[] args) {
		
	/*	int[][] arr = new int[2][3];
		
		System.out.println(arr.length); //2  ���� ����
		System.out.println(arr[0].length); //3  1���� ����ǰ���
		System.out.println(arr[1].length); //3  2���� ����ǰ���
    */
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//���ĺ� �ֱ�
		char[][] alphabets = new char[13][2];
		
	}

}
