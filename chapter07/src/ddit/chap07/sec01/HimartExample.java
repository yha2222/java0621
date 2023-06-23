package ddit.chap07.sec01;

public class HimartExample {

	public static void main(String[] args) {
		Tv tv = new Tv(1500);
		Goods g1 = new Tv(2000); //다형성 - 매개변수로 구현
		System.out.println(tv); 	 
		System.out.println(tv.price);
		System.out.println(tv.bonusPoint);
		
		Customer gil = new Customer();
		gil.buy(new Computer(2000)); //Customer.buy()
		gil.buy(tv);  		
		gil.buy(g1); //다형성
		gil.buy(new Audio(500));
		gil.summary(); 				 
		
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
