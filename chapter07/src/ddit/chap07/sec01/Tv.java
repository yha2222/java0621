package ddit.chap07.sec01;

public class Tv extends Goods {
	//Goods
	
	//int price
	Tv(int price){
		//Goods
		super(price);
	}
	
	@Override
	public String toString() {
		return "ThinQ TV";
	}
}
