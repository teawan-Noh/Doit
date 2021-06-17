package Chapter7;

public class ObjectCopy { //객체 배열 복사는 주소가 복사 된다.
						 

	public static void main(String[] args) {
		
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		bookArray2[0] = new Book(); //두개의 배열이 다른 값을 가지고 싶으면 인스턴스를 추가로 생성해주면 된다.
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setAutor(bookArray1[i].getAutor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("나무");
		bookArray1[0].setAutor("김장");
		
	/*	for(int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("--------------");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		*/
		
		//향상된 for문
		String[] strArr = {"Java", "Android", "C"};
		
		for(String s : strArr) { //처음부터 끝까지 모든 배열을 돌릴때 사용
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
