package example;

import java.util.*;
public class two_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��ϼ���>>");
		String line=scan.next(); //�ϳ� �Է�
		char alpha=line.charAt(0); //���ڿ��� ù��° ����
		for(int i=0;i<=alpha-97;i++)
		{
			for(char j='a';j<=alpha-i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
