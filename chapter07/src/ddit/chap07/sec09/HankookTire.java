package ddit.chap07.sec09;

public class HankookTire extends Tire {
	//부모클래스 생성
	HankookTire(int maxRotation, String location){
		super(maxRotation, location);
	}
	
	@Override
	public boolean roll() {
		++accumulateRotation; //누적회전수 증가
		if(accumulateRotation < maxRotation) {
			System.out.println(location+ "Hankooktire의 수명: " 
		+(maxRotation-accumulateRotation));
			return true;
		}else {
			System.out.println(location + "Hankooktire 교체 요망");
			return false;
		}
	}
}
