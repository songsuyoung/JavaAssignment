package PartOne;

public class Circle {

	int radius;
	String name;
	public Circle() {
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle pizza;
		pizza=new Circle();
		
		pizza.name="자바피자";
		pizza.radius=10;
		double area = pizza.getArea();

		System.out.println(pizza.name+"의 면적은 "+area);
		Circle donut=new Circle();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
