package example;

import java.util.Scanner;

class Seat{
	private String name;
	private int seatNum;
	
	Seat(String name,int seatNum){
		this.name=name;
		this.seatNum=seatNum;
	}
	
	String getName() {
		return name;
	}
}
public class BookingSystem {

	Scanner scan;
	Seat[] Aseat;
	Seat[] Bseat;
	Seat[] Sseat;
	BookingSystem(){
		scan=new Scanner(System.in);
		Aseat=new Seat[10]; //a b c �¼� 30��
		Bseat=new Seat[10];
		Sseat=new Seat[10];
	}
	
	public void reserve() {
		int seatType;
		
		System.out.print("�¼� ���� S(1), A(2), B(3)>>");
		seatType=scan.nextInt();
		while(seatType<1||seatType>4) {
			System.out.println("�¼� ���� ���� �ٽ� �Է¹ٶ��ϴ�.");
			seatType=scan.nextInt();
		}
		String name;
		int seatNum;
		switch(seatType) {
		case 1:
			System.out.print("S>> ");
			for(int i=0;i<Sseat.length;i++)
			{
				if(Sseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Sseat[i].getName()+" ");
			}
			System.out.println();
			System.out.print("�̸�>>");
			name=scan.next();
			System.out.print("��ȣ>>");
			seatNum=scan.nextInt();
			
			while(seatNum>=10) {
				System.out.print("�¼� ���� �ʰ�, �ٽ��Է¹ٶ��ϴ�.");
				System.out.print("��ȣ>>");
				seatNum=scan.nextInt();
			}
			Sseat[seatNum-1]=new Seat(name,seatNum);
			break;
		case 2:
			System.out.print("A>> ");
			for(int i=0;i<Aseat.length;i++)
			{
				if(Aseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Aseat[i].getName()+" ");
			}
			System.out.println();
			System.out.print("�̸�>>");
			name=scan.next();
			System.out.print("��ȣ>>");
			seatNum=scan.nextInt();
			
			while(seatNum>=10) {
				System.out.print("�¼� ���� �ʰ�, �ٽ��Է¹ٶ��ϴ�.");
				System.out.print("��ȣ>>");
				seatNum=scan.nextInt();
			}
			Aseat[seatNum-1]=new Seat(name,seatNum);
		
			break;
		default:
			System.out.print("B>> ");
			for(int i=0;i<Bseat.length;i++)
			{
				if(Bseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Bseat[i].getName()+" ");
			}	
			System.out.println();
			System.out.print("�̸�>>");
			name=scan.next();
			System.out.print("��ȣ>>");
			seatNum=scan.nextInt();
			
			while(seatNum>=10) {
				System.out.print("�¼� ���� �ʰ�, �ٽ��Է¹ٶ��ϴ�.");
				System.out.print("��ȣ>>");
				seatNum=scan.nextInt();
			}
			Bseat[seatNum-1]=new Seat(name,seatNum);
		
			break;
		}
	}
	public void showSeat() {
		System.out.print("S>> ");
		for(int i=0;i<Sseat.length;i++)
			if(Sseat[i]==null)
				System.out.print("--- ");
			else
				System.out.print(Sseat[i].getName()+" ");
		System.out.println();
		System.out.print("A>> ");
		for(int i=0;i<Aseat.length;i++)
			if(Aseat[i]==null)
				System.out.print("--- ");
			else
				System.out.print(Aseat[i].getName()+" ");
		System.out.println();
		System.out.print("B>> ");
		for(int i=0;i<Bseat.length;i++)
			if(Bseat[i]==null)
				System.out.print("--- ");
			else
				System.out.print(Bseat[i].getName()+" ");
		System.out.println();
		System.out.println("<<<��ȸ �Ϸ�Ǿ����ϴ�.>>>");
	}
	public void exitSystem() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	private void cancelSeat() {
		// TODO Auto-generated method stub
		System.out.print("�¼� S:1, A:2, B:3>>");
		int seatType=scan.nextInt();
		
		while(seatType<1||seatType>3)
		{
			System.out.println("�߸��� �¼�Ÿ���Դϴ�. �ٽ� ������ �ּ���.");
			System.out.print("�¼� S:1, A:2, B:3>>");
			seatType=scan.nextInt();
		}
		switch(seatType) {
		case 1:
			for(int i=0;i<Sseat.length;i++)
				if(Sseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Sseat[i].getName()+" ");
			System.out.println();
				
				
			System.out.print("�̸�>>");
			String name=scan.next();
			for(int i=0;i<Sseat.length;i++)
				if(Sseat[i]!=null)
					if(name.equals(Sseat[i].getName()))
						Sseat[i]=null; //�������� ����� ����.
			break;
		case 2:
			for(int i=0;i<Aseat.length;i++)
				if(Aseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Aseat[i].getName()+" ");
			System.out.println();
				
				
			System.out.print("�̸�>>");
			name=scan.next();
			for(int i=0;i<Aseat.length;i++)
				if(Aseat[i]!=null)
					if(name.equals(Aseat[i].getName()))
						Aseat[i]=null; //�������� ����� ����.
			break;
		case 3:
			for(int i=0;i<Bseat.length;i++)
				if(Bseat[i]==null)
					System.out.print("--- ");
				else
					System.out.print(Bseat[i].getName()+" ");
			System.out.println();
				
				
			System.out.print("�̸�>>");
			name=scan.next();
			for(int i=0;i<Bseat.length;i++)
				if(Bseat[i]!=null)		
					if(name.equals(Bseat[i].getName()))
						Bseat[i]=null; //�������� ����� ����.
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ǰ�ܼ�ƮȦ ����ý����Դϴ�.");
		BookingSystem booking =new BookingSystem();
		int option=-1;
		while(true) {

			System.out.print("���� :1, ��ȸ:2, ���:3, ������ 4:>>");
			option=booking.scan.nextInt();
			if(option==1) 
				booking.reserve();
			else if(option==2)
				booking.showSeat();
			else if(option==3)
				booking.cancelSeat();
			else if(option==4) {
				booking.exitSystem();
				break;
			}
			else
				System.out.println("�߸��� �Է°� �Դϴ�.");
		}
	}
	
}

