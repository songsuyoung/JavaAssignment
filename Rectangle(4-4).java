package example;

import java.util.Scanner;

public class Rectangle {

	private int width;
	private int height;
	private int x;
	private int y;
	
	Rectangle(int x,int y,int w,int h){
		this.x=x;
		this.y=y;
		this.width=w;
		this.height=h;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getWidth() {
		return width;
	}
	int getHeight() {
		return height;
	}
	void show() {
		System.out.println("("+x+","+y+")"+"���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	int square() {
		return width*height;
	}
	boolean contains(Rectangle r) { //�����ϱ� �����ϱ�
		if(x<r.getX()&&y<r.getY())
			if(x+width>r.getX()+r.getWidth()&&y+height>r.getY()+r.getHeight() ) {
				return true;
			}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r))
			System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s))
			System.out.println("t�� s�� �����մϴ�.");
	}

}
