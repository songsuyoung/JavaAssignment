import java.util.*;
import java.io.*;

public class ex8_10 {

	private String fileName = "c:\\temp\\phone.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();

	private void readPhoneFile() {
		try {
			Scanner fScanner = new Scanner(new FileReader(new File(fileName)));
			while(fScanner.hasNext()) {
				String name = fScanner.next();
				String tel = fScanner.next(); 
				phoneMap.put(name, tel); 
			}			
			fScanner.close();	
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�� " + phoneMap.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");
	}
	
	private void processQuery() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�̸�>> ");
			String name = scanner.next(); // �̸� �Է�
			if(name.equals("�׸�"))
				break;
			String tel = phoneMap.get(name);
			if(tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");			
			}
			else{
				System.out.println(tel);
			}
		}

		scanner.close();
	}	
	public void run() {
		readPhoneFile();
		processQuery();
	}
	
	public static void main(String[] args) {
		new ex8_10().run();
		
	}
}