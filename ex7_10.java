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
			
			System.out.println("그래픽 에디터 beauty을 실행합니다.");
			Scanner scan=new Scanner(System.in);
			boolean stop=false;
			int op=-1;
			int setop=-1;
			
			while(!stop) {
				System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>>");
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
					System.out.print("삭제할 도형의 위치>>>");
					setop=scan.nextInt();
					
					try {
						shape.remove(setop);
					}catch(Exception e) {
						System.out.println("삭제할 수 없습니다.");
					}
					break;
				case 3:
					for(Shape tmp:shape)
						tmp.draw();
					break;
				case 4:
					stop=true;
					System.out.println("beauty를 종료합니다.");
					break;
				}
			}
	}

}
