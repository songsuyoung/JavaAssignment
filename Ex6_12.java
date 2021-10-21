package ex;
import java.math.*;
import java.util.*;

class Person{
	String name;
	int[] nums;
	
	Person(String name){
		this.name=name;
		nums=new int[3];
	}
	
	String getName() {
		return name;
	}
	void generateRan() {		
		for(int i=0;i<nums.length;i++)
			nums[i]=(int)(Math.random()*3 + 1);
		
	}
	
	boolean compareThree() {
		if(nums[0]==nums[1]&&nums[1]==nums[2])
			return true;
		return false;
	}
	void showThree() {
		System.out.print("   "+nums[0]+"  "+nums[1]+"  "+nums[2]+"    ");
	}
}
public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		Scanner scan=new Scanner(System.in);
		int PersonNum=scan.nextInt();

		Person[] person=new Person[PersonNum];
		
		for(int i=0;i<PersonNum;i++) {
			System.out.print(i+1+"번째 선수 이름>>");
			person[i]=new Person(scan.next());
		}
		int num=0;
		String enter;
		while(true) {
			System.out.print(person[num%3].getName()+":");
			enter=scan.next();
			if(!enter.equals("<Enter>"))
				continue;
			
			person[num%3].generateRan();
			person[num%3].showThree();
			if(person[num%3].compareThree()) {
				System.out.println(person[num%3].getName()+"님이 이겼습니다.");
				break;
			}
			else
				System.out.println("아쉽습니다.");
			num++;
		}
	}

}
