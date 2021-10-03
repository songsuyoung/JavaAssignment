package example;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("한영 단어 검색 프로그램입니다.");
		
		Scanner scan = new Scanner(System.in);
		String word="";
		while(true) {
			System.out.print("한글 단어?");
			word=scan.next();
			if(word.equals("그만"))
				break;
			if(Dictionary.kor2Eng(word)==null)	
				System.out.println(word+"는 저의 사전에 없습니다.");	
			else
				System.out.println(word+"는 "+Dictionary.kor2Eng(word));
		}
		scan.close();

	}
}
