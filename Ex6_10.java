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

public class Ex6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] person=new Person[2];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<person.length;i++) {
			System.out.print(i+1+"번째 선수 이름>>");
			person[i]=new Person(scan.next());
		}
		int num=0;
		String enter;
		while(true) {
			System.out.print(person[num%2].getName()+":");
			enter=scan.next();
			if(!enter.equals("<Enter>"))
				continue;
			
			person[num%2].generateRan();
			person[num%2].showThree();
			if(person[num%2].compareThree()) {
				System.out.println(person[num%2].getName()+"님이 이겼습니다.");
				break;
			}
			else
				System.out.println("아쉽습니다.");
			num++;
		}
	}

}
