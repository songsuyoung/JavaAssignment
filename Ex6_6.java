package ex;
import java.util.*;

class Person{
	int sec1,sec2;
	String name;
	Scanner scan=new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	
	Person(String name){
		this.name=name;
	}
	public int game() {
		System.out.print(name+" ���� <Enter>Ű  >>");
		scan.nextLine();
		now = Calendar.getInstance();
		System.out.println("���� �� �ð� = "+ now.get(Calendar.SECOND));
		sec1= now.get(Calendar.SECOND);
		 
		System.out.print("10�� ���� �� <Enter>Ű  >>");
		
		scan.nextLine();
		now = Calendar.getInstance();
		System.out.println("���� �� �ð� = "+ now.get(Calendar.SECOND));
		sec2= now.get(Calendar.SECOND);
		if(sec1 < sec2)
			return sec2-sec1;
		else 
			return (60-sec1) + sec2;
	}
}
public class Ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person=new Person[2];
		person[0]=new Person("Ȳ����");
		person[1]=new Person("�̱⹮");
		int[] result=new int[2];
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		for(int i=0;i<person.length;i++) {
			result[i]=person[i].game();
		}
		
		if(Math.abs(result[0] - 10) < Math.abs(result[1] - 10))
			System.out.println("Ȳ������ ��� "+result[0]+", ���繮�� ��� "+result[1]+", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� "+result[0]+", ���繮�� ��� "+result[1]+", ���ڴ� ���繮");
	}

}
