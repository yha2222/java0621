package ddit.chap07.sec01;

public class Goods {
	protected int price;
	protected int bonusPoint;

	Goods(int price){
		this.price = price;
		bonusPoint = (int)(price*0.01);
	}
}
