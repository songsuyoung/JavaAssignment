import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		int longestIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요>>");
			String s = scanner.next();
			a.add(s); 
			}
		
		for(int i=0; i<a.size(); i++) {
		String name = a.get(i);
		System.out.print(name + " ");
		}
		for(int i1=1; i1<a.size(); i1++) {
			if(a.get(longestIndex).length() < a.get(i1).length())
				longestIndex = i1;
		}
		System.out.println("\n가장 긴 이름은 : " +a.get(longestIndex));
		
		scanner.close();
		
	}

}
