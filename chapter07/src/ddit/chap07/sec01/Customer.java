package ddit.chap07.sec01;

public class Customer {
	private int sum;
	private int bonusPoint;
	private String items = "";
	
	//세 개 따로 안 만들고 부모 써서 하나로 퉁침 => 개수는 이제 상관없다
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
