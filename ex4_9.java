package example;

public class ex4_9 {

	public static void main(String[] args) {
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		String d,e;
		
		a=null; //가비지 발생, good을 가리키던 a가 null을 가리킴
		d=c; 
		c=null; //가비지가 안발생할것같다 왜냐면, d가 Bad를 연결하고 있기때문.
	}
}
