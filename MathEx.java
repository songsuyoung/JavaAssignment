package ex;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=1.45;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a)); // ceil(�ø�)
		System.out.println(Math.floor(a)); // floor(����)
		System.out.println(Math.sqrt(9)); // ������
		System.out.println(Math.exp(2)); // e�� 2��
		System.out.println(Math.round(3.14)); // �ݿø�
		//�����߻�
		System.out.print("�̹��� ����� ��ȣ�� ");
		for(int i=0; i<5; i++)
		System.out.print((int)(Math.random()*45 + 1) + " ");
	}

}
