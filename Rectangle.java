package example;

import java.util.Scanner;

public class Rectangle {

	int width;
	int height;
	
	int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle();
		Scanner scan=new Scanner(System.in);
		System.out.print(">>");
		rect.width=scan.nextInt();
		rect.height=scan.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
	}

}
