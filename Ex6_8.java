package ex;

import java.util.*;
public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int first=0;
		System.out.println("문자열을 입력하세요. 빈칸도 있어도 되고 영어 한글 모두 됩니다.");
		String line=scan.nextLine();
		while(first<=line.length()) {
			System.out.println(line.substring(first)+line.substring(0,first));
			first++;
		}
	}

}
