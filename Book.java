package example;

public class Book {

	String title;
	String author;
	
	public Book() {
		this("","");
		System.out.println("������ ȣ���");
	}
	public Book(String t) {
		this(t,"���ڹ̻�");
	}
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public void show() {
		System.out.println(title+" "+author);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book littlePrince=new Book("�����","�������丮");
		
		Book loveStory=new Book("������");
		Book emptyBook=new Book();
		
		loveStory.show();
	}

}
