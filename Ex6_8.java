package ex;

import java.util.*;
public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int first=0;
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String line=scan.nextLine();
		while(first<=line.length()) {
			System.out.println(line.substring(first)+line.substring(0,first));
			first++;
		}
	}

}
