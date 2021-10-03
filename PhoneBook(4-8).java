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
		System.out.println(name+"의 번호는 "+numbers+" 입니다.");
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
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			String name=scan.next();
			String phoneNum=scan.next();
			phone[i]=new Phone(name,phoneNum);
			i++;
		}
		System.out.println("저장되었습니다...");
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
		System.out.print("인원수>>");
		int count=scan.nextInt();
		PhoneBook phoneBook=new PhoneBook(count);
		
		phoneBook.StorePhone();
		String search="";
		while(true) {
			System.out.print("검색할 이름>>");
			search=scan.next();
			if(search.equals("그만"))
				break;
			if(phoneBook.SearchPhone(search)==-1)
				System.out.println(search+" 이 없습니다.");
			else
				phoneBook.show(phoneBook.SearchPhone(search));
				
		}
		scan.close();
	}

}
