package ddit.chap07.sec01;

public class Prac03 extends Prac01 {
	//KumhoTire
	public Prac03(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " KumhoTire 펑크***" );
			return false;
		}
	}
}
