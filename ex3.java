package example;
import java.util.*;

public class ex3 {

	public static void main(String[] args) {
		
		int p1_x,p1_y;
		int p2_x,p2_y;
		Scanner scan = new Scanner(System.in);
		System.out.print("Á¡ p1ÀÇ xÁÂÇ¥,yÁÂÇ¥ ÀÔ·Â:");
		p1_x=scan.nextInt();
		p1_y=scan.nextInt();
		System.out.print("Á¡ p2ÀÇ xÁÂÇ¥,yÁÂÇ¥ ÀÔ·Â:");
		p2_x=scan.nextInt();
		p2_y=scan.nextInt();
		
		if(inRect(100,200,p1_x,p1_y,p2_x,p2_y)) {
			System.out.println("Ãæµ¹");
		}
		else
			System.out.println("¹ÌÃæµ¹");
		
	}
	
	public static boolean inRect(int x,int y,int rectx1,int recty1,int rectx2,int recty2) {
		
		if((x>=rectx1&&y<=rectx2)||(y>=recty1&&y<=recty2))
			return true;
		return false;
	}
	
}
