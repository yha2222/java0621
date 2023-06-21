package ddit.chap07.sec01;

//부모 클래스
public class Goods {
	//어느 패키지에 있든 상관없음 언제든지 접근 가능
	protected int price;
	protected int bonusPoint;
	
	Goods(int price){
		this.price = price;
		bonusPoint = (int)(price*0.01);
	}
}
