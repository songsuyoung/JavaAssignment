import java.util.*;
import java.util.Map.Entry;

class Location{
	
	private int latitude;
	private int longitude;
	
	Location(int latitude,int longitude){
		this.latitude=latitude;
		this.longitude=longitude;
	}
	
	int getLatitude() {
		return latitude;
	}
	int getLongitude() {
		return longitude;
	}
}
public class ex7_6 {

	private HashMap<String,Location> loc;
	private Scanner scan;
	
	ex7_6(){
		loc=new HashMap<String,Location>();
		scan=new Scanner(System.in);
	}
	void input() {
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		String line;
		String city;
		int lati;//위도 
		int loti;//경도
		for(int i=0;i<4;i++)
		{
			System.out.print(">> ");
			line =scan.nextLine();
			String div_line[]= line.split(",");
			city=div_line[0];
			lati=Integer.parseInt(div_line[1]);
			loti=Integer.parseInt(div_line[2]);
			
			loc.put(city,new Location(lati,loti));
		}
	}
	
	void print() {
	
		System.out.println("----------------------------------");
		for(Entry<String,Location> tmp: loc.entrySet())
			System.out.println(tmp.getKey()+"  "+tmp.getValue().getLatitude()+"  "+tmp.getValue().getLongitude());
		System.out.println("----------------------------------");		
	
	}
	void search() {
		String searchName;
		int count=-1;
		while(true) {
			System.out.print("도시 이름 >> ");
			searchName=scan.next();
			if(searchName.equals("그만"))
				break;
			
			for(Entry<String,Location> tmp: loc.entrySet()) {
				if(tmp.getKey().equals(searchName)) {
					System.out.println(tmp.getKey()+"  "+tmp.getValue().getLatitude()+"  "+tmp.getValue().getLongitude());
					count++;
					break;
				}
			}
			
			if(count==-1)
				System.out.println(searchName+"는 없습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ex7_6 ex=new ex7_6();
		ex.input();
		ex.print();
		ex.search();
	}

}
