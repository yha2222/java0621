package ddit.chap07.sec01;

public class Tv extends Goods {
	//부모클래스에 매개변수 있으니까 생성자에 알맞은 형태로 생성해라
	//Goods라는 메소드 없으면 오류 안 남
	
	//int price - 상속용
	Tv(int price){
		//Goods 클래스 생성 - 부모에 저장했다 상속 다시 받음
		super(price);
	}
	
	@Override
	public String toString() {
		return "ThinQ TV";
	}
}
