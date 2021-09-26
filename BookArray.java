package example;

import java.util.Scanner;

class Book{
	String title;
	String author;
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] books = new Book[2];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<books.length;i++) {
			System.out.print("����>>");
			String title=scan.nextLine();
			System.out.print("�۰�>>");
			String author=scan.nextLine();
			books[i]=new Book(title,author);//�迭������ ��ü����
		}
		
		for(int i=0;i<books.length;i++)
			System.out.println("( "+books[i].title+" , "+books[i].author+" )");
		
		scan.close();
	}

}
