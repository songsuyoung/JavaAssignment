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
		System.out.print(name+" 시작 <Enter>키  >>");
		scan.nextLine();
		now = Calendar.getInstance();
		System.out.println("현재 초 시간 = "+ now.get(Calendar.SECOND));
		sec1= now.get(Calendar.SECOND);
		 
		System.out.print("10초 예상 후 <Enter>키  >>");
		
		scan.nextLine();
		now = Calendar.getInstance();
		System.out.println("현재 초 시간 = "+ now.get(Calendar.SECOND));
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
		person[0]=new Person("황기태");
		person[1]=new Person("이기문");
		int[] result=new int[2];
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		for(int i=0;i<person.length;i++) {
			result[i]=person[i].game();
		}
		
		if(Math.abs(result[0] - 10) < Math.abs(result[1] - 10))
			System.out.println("황기태의 결과 "+result[0]+", 이재문의 결과 "+result[1]+", 승자는 황기태");
		else
			System.out.println("황기태의 결과 "+result[0]+", 이재문의 결과 "+result[1]+", 승자는 이재문");
	}

}
