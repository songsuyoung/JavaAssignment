package example;

public class Circle {

	int radius; // 자바 멤버 변수의 디폴트는 public
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
		pizza.name="자바피자";
		double area=pizza.getArea();
		
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut= new Circle();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	*/
		Circle pizza = new Circle(10,"자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut= new Circle();
		donut.name="도넛피자";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
		
	}

}
