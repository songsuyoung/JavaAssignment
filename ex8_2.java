import java.io.*;

public class ex8_2 {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:\\temp\\phone.txt");
			in = new InputStreamReader(fin, "UTF-8");
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
