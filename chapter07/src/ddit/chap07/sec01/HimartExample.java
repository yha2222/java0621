package ddit.chap07.sec01;

public class HimartExample {

	public static void main(String[] args) {
		Tv tv = new Tv(1500);
		System.out.println(tv); 	 //toString 생략되어 있어서 그 값 반환함
		System.out.println(tv.price);
		System.out.println(tv.bonusPoint);
		
		Customer gil = new Customer();
		gil.buy(new Computer(2000)); //바로 객체 생성
		gil.buy(tv);  				 //직접 변수 넣어줘도 됨
		gil.summary(); 				 //품목 요약
		
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
