package example;

import java.util.*;
public class two_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []unit= {50000,10000,1000,500,100,50,10,1};
		
		System.out.print("금액을 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		int money=scan.nextInt();
		
		for(int i=0;i<unit.length;i++) {
			int count=money/unit[i];
			if(count==0)
				continue;
			System.out.println(unit[i]+"원 짜리 : "+count+"개");
			money%=unit[i];
		}
		scan.close();
	}

}
