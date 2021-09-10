package example;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>>");
		String line = scan.nextLine(); //라인으로 입력 받아서 split 내장함수를 이용해서 " "을 중심으로 자른다.
		String tmp[]=line.split(" ");
		
		num1=Integer.parseInt(tmp[0]); //잘랐을때 나오는 3등분 중 가운데 값을 op이라고 생각하여 작성하였다.
		num2=Integer.parseInt(tmp[2]);
		
		if(tmp[1].equals("+"))
			System.out.println(num1+"+"+num2+"의 계산결과는 "+(num1+num2));
		else if(tmp[1].equals("-"))
			System.out.println(num1+"-"+num2+"의 계산결과는 "+(num1-num2));
		else if(tmp[1].equals("*"))
			System.out.println(num1+"*"+num2+"의 계산결과는 "+(num1*num2));
		else if(tmp[1].equals("/"))
			if(num2!=0)
				System.out.println(num1+"/"+num2+"의 계산결과는 "+(num1/num2));
			else
				System.out.println("0으로 나눌수 없습니다.");
		
	}
}
