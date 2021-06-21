package Chapter7;

public class TowDimensionArray {//이차원 배열

	public static void main(String[] args) {
		
	/*	int[][] arr = new int[2][3];
		
		System.out.println(arr.length); //2  행의 길이
		System.out.println(arr[0].length); //3  1행의 요소의갯수
		System.out.println(arr[1].length); //3  2행의 요소의갯수
    */
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//알파벳 넣기
		char[][] alphabets = new char[13][2];
		
	}

}
