package example;

import java.util.Scanner;

class Phone{
	private String name;
	private String numbers;
	
	Phone(String name,String numbers){
		this.name=name;
		this.numbers=numbers;
	}
	String getName() {
		return name;
	}
	void show() {
		System.out.println(name+"�� ��ȣ�� "+numbers+" �Դϴ�.");
	}
}
public class PhoneBook {

	Phone[] phone;
	int num;
	PhoneBook(int num){
		phone=new Phone[num];
		this.num=num;
	}
	
	void StorePhone() {

		Scanner scan=new Scanner(System.in);
		int i=0;
		while(i<num) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			String name=scan.next();
			String phoneNum=scan.next();
			phone[i]=new Phone(name,phoneNum);
			i++;
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	
	int SearchPhone(String name) {
		
		for(int i=0;i<num;i++)
			if(phone[i].getName().equals(name))
				return i;
		
		return -1;
	}
	
	void show(int i) {
		phone[i].show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("�ο���>>");
		int count=scan.nextInt();
		PhoneBook phoneBook=new PhoneBook(count);
		
		phoneBook.StorePhone();
		String search="";
		while(true) {
			System.out.print("�˻��� �̸�>>");
			search=scan.next();
			if(search.equals("�׸�"))
				break;
			if(phoneBook.SearchPhone(search)==-1)
				System.out.println(search+" �� �����ϴ�.");
			else
				phoneBook.show(phoneBook.SearchPhone(search));
				
		}
		scan.close();
	}

}
