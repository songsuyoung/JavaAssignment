package example;
import java.util.*;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] computer = {"가위","바위","보"};
		Scanner scan =new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 입력합니다.");
		
		while(true) {
			int ran=(int) ((Math.random()*3)%3);	
			System.out.print("가위 바위 보!>>");
			String input=scan.next();
			
			if(input.equals("그만"))
				break;
			
			if(computer[ran].equals(input))
				System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"비겼습니다.");
			
			switch(input) {
			case "가위":
				if(computer[ran].equals("보"))
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"사용자가 이겼습니다.");
				else
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"컴퓨터가 이겼습니다.");
				break;
			case "바위":
				if(computer[ran].equals("가위"))
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"사용자가 이겼습니다.");
				else
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"컴퓨터가 이겼습니다.");
				break;
			default:
				if(computer[ran].equals("바위"))
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"사용자가 이겼습니다.");
				else
					System.out.println("사용자 = "+input+", 컴퓨터 = "+computer[ran]+","+"컴퓨터가 이겼습니다.");
			}
		}
	}

}
