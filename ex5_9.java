package example;

interface PhoneInterface{
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x,int y)
	{
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("������������~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�.");
			
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���� �ߴ��մϴ�.");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("���� ���ϴ�.");
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խ��ϴ�.");
		
	}

	public void schedule() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�.");
		
	}
	
	
}
public class ex5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone=new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ� "+phone.calculate(3, 5));
		phone.schedule();
	}

}
