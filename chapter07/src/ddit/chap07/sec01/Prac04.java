package ddit.chap07.sec01;

public class Prac04 extends Prac01 {
	//HankookTire
	//필드
	//생성자
	public Prac04(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire 펑크***" );
			return false;
		}
	}
}
