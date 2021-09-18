package example;

import java.util.*;
public class two_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("소문자 알파벳 하나를 입력하세요>>");
		String line=scan.next(); //하나 입력
		char alpha=line.charAt(0); //문자열의 첫번째 문자
		for(int i=0;i<=alpha-97;i++)
		{
			for(char j='a';j<=alpha-i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
