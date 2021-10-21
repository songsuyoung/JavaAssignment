package ex;

import app.Circle;

class Circle{
	int x,y,radius;
	
	Circle(int x,int y,int radius){
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getRadius() {
		return radius;
	}
	public boolean equals(Circle cir) {
		if(cir.getX()==x&&cir.getY()==y)
			return true;
		return false;
	}
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
	}
}
public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a=new Circle(2,3,5);
		Circle b=new Circle(2,3,30);
		System.out.println("원 a : "+a);
		System.out.println("원 b : "+b);
		
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}

}
