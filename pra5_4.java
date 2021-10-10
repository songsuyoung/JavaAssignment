package example;
import java.util.*;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scan.nextDouble();
		double res=convert(val);
		System.out.println("변환결과: "+res+getDestString()+"입니다.");
		scan.close();
	}
}
class Km2Mile extends Converter{

	private double mile;
	
	Km2Mile(double mile){
		this.mile=mile;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return src/mile;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}
	
}
public class pra5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Km2Mile toMile= new Km2Mile(1.6);
		toMile.run();
	}

}
