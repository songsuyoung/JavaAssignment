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
		
		pizza.name="�ڹ�����";
		pizza.radius=10;
		double area = pizza.getArea();

		System.out.println(pizza.name+"�� ������ "+area);
		Circle donut=new Circle();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}

}
