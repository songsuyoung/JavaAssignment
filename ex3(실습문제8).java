package example;
import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		
		int p1_x,p1_y;
		int p2_x,p2_y;
		Scanner scan = new Scanner(System.in);
		System.out.print("점 p1의 x좌표,y좌표 입력:");
		p1_x=scan.nextInt();
		p1_y=scan.nextInt();
		System.out.print("점 p2의 x좌표,y좌표 입력:");
		p2_x=scan.nextInt();
		p2_y=scan.nextInt();
		
		if(inRect(100,200,p1_x,p1_y,p2_x,p2_y)) {
			System.out.println("충돌");
		}
		else
			System.out.println("미충돌");
		
	}
	
	public static boolean inRect(int x,int y,int rectx1,int recty1,int rectx2,int recty2) {
		
		if((x>=rectx1&&y<=rectx2)||(y>=recty1&&y<=recty2))
			return true;
		return false;
	}
	
}
