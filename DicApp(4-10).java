package example;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		Scanner scan = new Scanner(System.in);
		String word="";
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			word=scan.next();
			if(word.equals("�׸�"))
				break;
			if(Dictionary.kor2Eng(word)==null)	
				System.out.println(word+"�� ���� ������ �����ϴ�.");	
			else
				System.out.println(word+"�� "+Dictionary.kor2Eng(word));
		}
		scan.close();

	}
}
