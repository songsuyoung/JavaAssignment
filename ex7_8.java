
import java.util.*;
import java.util.Map.Entry;
public class ex7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> customer=new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");
		String name;
		int point;
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է�>> ");
			name=scan.next();
			if(name.equals("�׸�"))
				break;
			point=scan.nextInt();
			for(Entry<String,Integer> entry : customer.entrySet()) {	
				if(entry.getKey().equals(name))
				{
					point+=entry.getValue();
				}
			}
			customer.put(name, point);
			
			for(Entry<String,Integer> entry : customer.entrySet()) {	
				System.out.print("("+entry.getKey()+","+entry.getValue()+")");
			}
			System.out.println();
		}
	}

}
