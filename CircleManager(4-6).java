package example;

import java.util.Scanner;

class Circle{
	private float x;
	private float y;
	private int radius;
	
	Circle(float x,float y,int radius){
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	double getArea() {
		return radius*radius*3.14;
	}
	boolean compares(Circle a) {
		if(getArea()>a.getArea())
			return true;
		return false;
	}
	void show() {
		System.out.println("가장 면적이 큰 원은"+"("+x+","+y+")"+radius);
	}
}
public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Circle[] circle=new Circle[3];
		for(int i=0;i<3;i++) {
			System.out.print("x, y, radius >>");
			float x=scan.nextFloat();
			float y=scan.nextFloat();
			int radius=scan.nextInt();
			circle[i]=new Circle(x,y,radius);
		}
		
		if(circle[0].compares(circle[1]))
			if(circle[0].compares(circle[2]))
				circle[0].show();
			else
				circle[2].show();
		else
			if(circle[1].compares(circle[2]))
				circle[1].show();
			else
				circle[2].show();
		
	}

}
