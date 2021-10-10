package example;

class Point{
	private int x,y;//������ �����ϴ� x,y private
	public Point() {
		this.x=this.y=0;
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x,int y,String color) {
		super(x,y); //��ӹ��� point�� �����ڿ��� ����
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp=new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}

}
