package example;
class Point5_6{ //Point라는 class가 많아서 바꿨어요
	private int x,y;
	public Point5_6(int x,int y) {
		this.x=x; this.y=y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x,int y) {
		this.x=x;this.y=y;
	}
}

class ColorPoint5_6 extends Point5_6{
	private String color;
	ColorPoint5_6(){
		super(0,0);
		color="BLACK";
	}
	ColorPoint5_6(int x,int y){
		super(x,y);
	}
	void setColor(String color) {
		this.color=color;
	}
	void setXY(int x,int y) {
		move(x,y);
	}
	public String toString() {
		return color+"색의 "+"("+getX()+","+getY()+")의 점";
	}
	
}
public class pra5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColorPoint5_6 zeroPoint=new ColorPoint5_6();
		System.out.println(zeroPoint.toString()+"입니다.");
	
		ColorPoint5_6 cp=new ColorPoint5_6();
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	
	}

}
