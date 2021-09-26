package example;

public class Circle {

	int radius; // �ڹ� ��� ������ ����Ʈ�� public
	String name;
	final double PI=3.14;
	
	public Circle() {
		radius=1; name="";
	}
	public Circle(int radius,String name) {
		this.name=name;
		this.radius=radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Circle pizza= new Circle();
		pizza.radius=10;
		pizza.name="�ڹ�����";
		double area=pizza.getArea();
		
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut= new Circle();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	*/
		Circle pizza = new Circle(10,"�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut= new Circle();
		donut.name="��������";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
		
	}

}
