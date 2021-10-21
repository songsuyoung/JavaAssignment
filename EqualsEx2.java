package ex;

class Rect{
	int width;
	int height;
	public Rect(int w,int h) {
		width=w;
		height=h;
	}
	public boolean equals(Object obj) {
		Rect p=(Rect)obj;
		if(width*height==p.width*p.height)
			return true;
		return false;
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b))
		System.out.println("a is equal to b");
		if(a.equals(c))
		System.out.println("a is equal to c");
		if(b.equals(c))
		System.out.println("b is equal to c");
	}

}
