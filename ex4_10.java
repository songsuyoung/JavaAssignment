package example;
class Sample{
	private int a;
	private int b;
	int c;
}
public class ex4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample aClass=new Sample();
		aClass.a=10;//private 는 접근불가
		aClass.b=10;
		aClass.c=10; //얘만변경
		}

}
