package example;

class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV{
	private int color;
	ColorTV(int size,int color){
		super(size);
		this.color=color;
	}
	void printProperty() {
		System.out.print(getSize()+"��ġ "+color+"�÷�");
	}
}
class IPTV extends ColorTV{
	private String ip;
	IPTV(String ip,int size,int color){
		super(size,color);
		this.ip=ip;
	}
	void printProperty() {
		System.out.print("���� IPTV�� "+ip+"�ּ��� ");
		super.printProperty();
	}
}

public class pra5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}

}
