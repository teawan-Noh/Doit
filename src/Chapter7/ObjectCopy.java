package Chapter7;

public class ObjectCopy { //��ü �迭 ����� �ּҰ� ���� �ȴ�.
						 

	public static void main(String[] args) {
		
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("�¹���1", "������");
		bookArray1[1] = new Book("�¹���2", "������");
		bookArray1[2] = new Book("�¹���3", "������");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		bookArray2[0] = new Book(); //�ΰ��� �迭�� �ٸ� ���� ������ ������ �ν��Ͻ��� �߰��� �������ָ� �ȴ�.
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setAutor(bookArray1[i].getAutor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAutor("����");
		
	/*	for(int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("--------------");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		*/
		
		//���� for��
		String[] strArr = {"Java", "Android", "C"};
		
		for(String s : strArr) { //ó������ ������ ��� �迭�� ������ ���
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {
			System.out.println(num);
		}
	}

}
