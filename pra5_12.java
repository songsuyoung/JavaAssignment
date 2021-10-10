package example;

import java.util.Scanner;

abstract class Shape5_12{
	private Shape5_12 next;
	Shape5_12(){
		next=null;
	}
	public void setNext(Shape5_12 node) {next=node;}
	public Shape5_12 getNext() {
		return next;
	}
	abstract void draw();
}

class Line5_12 extends Shape5_12{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect5_12 extends Shape5_12{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle5_12 extends Shape5_12{
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor{
	Scanner scan;
	Shape5_12 start;
	GraphicEditor(){
		scan=new Scanner(System.in);
	}
	
	void input() {
		int setop=-1;
		
		System.out.print("Line(1), Rect(2), Circle(3)>>>");
		setop=scan.nextInt();
		Shape5_12 node = null;
		if(setop==1) 
			node=new Line5_12();
		else if(setop==2)
			node=new Rect5_12();
		else
			node=new Circle5_12();

		node.setNext(start);
		start=node;
	}
	
	boolean stop() {
		return false;
	}

	public void show() {
		// TODO Auto-generated method stub
		Shape5_12 node;
		for(node=start;node!=null;node=node.getNext())
			node.draw();
	}

	public void delete() {
		// TODO Auto-generated method stub
		
		if(start==null) {
			System.out.println("삭제할 요소가 없습니다.");
			return;
		}
		int pos=-1;
		System.out.print("삭제할 도형의 위치>>>");
		pos=scan.nextInt();
		Shape5_12 pre=null;
		Shape5_12 remove=start;
		for(int i=0;i<pos-1;i++){
			pre=remove;
			remove=remove.getNext();
		}
		if(pre!=null)	
			pre.setNext(remove.getNext());
		else
			start=remove.getNext();
		remove=null;
	}
}
public class pra5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		Scanner scan=new Scanner(System.in);
		int op=-1;
		GraphicEditor ge=new GraphicEditor();
		boolean stop=true;
		while(stop) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>>");
			op=scan.nextInt();
			switch(op) {
			case 1:
				ge.input();
				break;
			case 2:
				ge.delete();
				break;
			case 3:
				ge.show();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				stop=ge.stop();
			}
		}
	}

}
