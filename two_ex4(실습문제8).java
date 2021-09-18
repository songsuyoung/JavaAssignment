package example;
import java.util.*;
public class two_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num=scan.nextInt();
		
		int[] nums=new int[num];
		
		for(int i=0;i<nums.length;i++)
			nums[i]=((int)(Math.random()*100)+1);
		
		for(int i=0;i<nums.length;i++) {
			if((i%10)==0)
				System.out.println("");
			System.out.print(nums[i]+" ");
		}
		scan.close();
	}

}
