import java.util.*;

abstract class Shape{
	abstract void draw();
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Vector<Shape> shape=new Vector<Shape>();
			
			System.out.println("�׷��� ������ beauty�� �����մϴ�.");
			Scanner scan=new Scanner(System.in);
			boolean stop=false;
			int op=-1;
			int setop=-1;
			
			while(!stop) {
				System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>>");
				op=scan.nextInt();
				switch(op) {
				case 1:
					System.out.print("Line(1), Rect(2), Circle(3)>>>");
					setop=scan.nextInt();
					if(setop==1)
						shape.add(new Line());
					else if(setop==2)
						shape.add(new Rect());
					else
						shape.add(new Circle());
					break;
				case 2:
					System.out.print("������ ������ ��ġ>>>");
					setop=scan.nextInt();
					
					try {
						shape.remove(setop);
					}catch(Exception e) {
						System.out.println("������ �� �����ϴ�.");
					}
					break;
				case 3:
					for(Shape tmp:shape)
						tmp.draw();
					break;
				case 4:
					stop=true;
					System.out.println("beauty�� �����մϴ�.");
					break;
				}
			}
	}

}
