package PartOne;

public class Book {

	String title;
	String author;
	
	public Book(String title) {
		this.title=title;
		author="���ڹ̻�";
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book littlePrince=new Book("�����","�������丮");
		Book loveStory=new Book("������");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}

}
