package example;

public class ex4_9 {

	public static void main(String[] args) {
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		String d,e;
		
		a=null; //������ �߻�, good�� ����Ű�� a�� null�� ����Ŵ
		d=c; 
		c=null; //�������� �ȹ߻��ҰͰ��� �ֳĸ�, d�� Bad�� �����ϰ� �ֱ⶧��.
	}
}
