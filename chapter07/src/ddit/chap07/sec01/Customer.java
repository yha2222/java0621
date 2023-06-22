package ddit.chap07.sec01;

public class Customer {
	private int sum;
	private int bonusPoint;
	private String items = "";
	
	//������ upcasting Ŭ���� ����ȯ
	//�� ���� buy�޼ҵ� ǰ�� ������ŭ ������ ��
	public void buy(Goods good) {
		sum = sum + good.price;
		bonusPoint = bonusPoint + good.bonusPoint;
		items += good + ", ";
	}
	
	public void summary() {
		System.out.println("�����հ�: " + sum);
		System.out.println("���ʽ�����Ʈ: " + bonusPoint);
		System.out.println("����List: " + items);
	}
}
