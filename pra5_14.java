package example;

interface Shape5_14{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("*** 다시 그립니다.");
		draw();
	}
}

class Circle5_14 implements Shape5_14{

	int radius;
	Circle5_14(int r){
		radius=r;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*PI*radius;
	}
	
}
class Oval5_14 implements Shape5_14{

	int x,y;
	Oval5_14(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)x*y*PI;
	}
	
}
class Rect5_14 implements Shape5_14{

	int x,y;
	
	Rect5_14(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(x+"x"+y+"크기의 사각형입니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return x*y;
	}
	
}
public class pra5_14 {
	public static void main(String[] args) {
	
		Shape5_14[] list=new Shape5_14[3];
		list[0]=new Circle5_14(10);
		list[1]=new Oval5_14(20,30);
		list[2]=new Rect5_14(10,40);
		
		for(int i=0;i<list.length;i++) {
			list[i].redraw();
		}
		for(int i=0;i<list.length;i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}
}
