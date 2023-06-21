package ddit.chap07.sec01;

public class HimartExample {

	public static void main(String[] args) {
		Tv tv = new Tv(1500);
		System.out.println(tv); 	 //toString �����Ǿ� �־ �� �� ��ȯ��
		System.out.println(tv.price);
		System.out.println(tv.bonusPoint);
		
		Customer gil = new Customer();
		gil.buy(new Computer(2000)); //�ٷ� ��ü ����
		gil.buy(tv);  				 //���� ���� �־��൵ ��
		gil.summary(); 				 //ǰ�� ���
		
		
		Audio au = new Audio(300);
		System.out.println(au);
		System.out.println(au.price);
		System.out.println(au.bonusPoint);
		
		Computer com = new Computer(100);
		System.out.println(com);
		System.out.println(com.price);
		System.out.println(com.bonusPoint);
	}

}
