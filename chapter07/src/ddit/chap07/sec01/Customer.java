package ddit.chap07.sec01;

public class Customer {
	private int sum;
	private int bonusPoint;
	private String items = "";
	
	//다형성 upcasting 클래스 형변환
	//안 쓰면 buy메소드 품목 개수만큼 만들어야 됨
	public void buy(Goods good) {
		sum = sum + good.price;
		bonusPoint = bonusPoint + good.bonusPoint;
		items += good + ", ";
	}
	
	public void summary() {
		System.out.println("구매합계: " + sum);
		System.out.println("보너스포인트: " + bonusPoint);
		System.out.println("구매List: " + items);
	}
}
