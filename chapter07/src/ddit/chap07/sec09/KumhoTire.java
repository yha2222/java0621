package ddit.chap07.sec09;

public class KumhoTire extends Tire {
	
	KumhoTire(int maxRotation, String location){
		super(maxRotation, location);
	}
	
	public boolean roll() {
		++accumulateRotation; //누적회전수 증가
		if(accumulateRotation < maxRotation) {
			System.out.println(location+ "KumhoTire의 수명: " 
		+(maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println(location + "KumhoTire 교체 요망");
			return false;
		}
	}
}
