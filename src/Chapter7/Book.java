package Chapter7;

public class Book {
	
	private String bookName;
	private String autor;
	
	public Book() {}
	public Book(String bookName, String autor) {
		this.bookName = bookName;
		this.autor = autor;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + autor);
	}
	
}
