package example;

class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	protected int fire() {
		return 10;
		//method �������̵�
	}
}

public class ex5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Weapon weapon;
		weapon =new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� "+weapon.fire());
		weapon=new Cannon();
		System.out.println("������ �ǻ� �ɷ��� "+weapon.fire());

	}

}
