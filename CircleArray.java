package example;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}
public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle[] c;
		c= new Circle[5];
		
		for(int i=0;i<c.length;i++)
			c[i]=new Circle(i); //i锅掳 盔家 按眉 积己
		
		for(int i=0;i<c.length;i++)
			System.out.print(c[i].getArea()+" ");
	}

}
