package example;

class Point5_8{ //Point��� class�� ���Ƽ� �ٲ���
	private int x,y;
	Point5_8(int x,int y) {
		this.x=x; this.y=y;
	}
	Point5_8(){}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {
		
		this.x=x;this.y=y;
	}
}
class PositivePoint extends Point5_8{

	PositivePoint(){
		super(0,0);
	}
	
	PositivePoint(int x, int y) {
		if(x>=0&&y>=0)
			super.move(x,y);
		super.move(0,0);
	}
	public String toString() {
		return "("+getX()+","+getY()+")�� ��";
	}
	protected void move(int x,int y) {
		if(x>=0&&y>=0)
			super.move(x, y);
	}

	
}
public class pra5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			PositivePoint p=new PositivePoint();
			p.move(10,10);
			System.out.println(p.toString()+"�Դϴ�.");
			p.move(-5,5);
			System.out.println(p.toString()+"�Դϴ�.");
			PositivePoint p2=new PositivePoint(-10,-10);
			System.out.println(p2.toString()+"�Դϴ�.");
	}

}
