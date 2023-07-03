package ddit.chap07.sec01;

public class Prac01 {
	//Tire
	//필드
	public int maxRotation; //최대회전수
	public int accumulatedRotation; //누적회전수
	public String location;  //타이어 위치
	
	//생성자
	public Prac01(String location, int maxRotation) {  
		this.maxRotation = maxRotation; //필드 초기화
		this.location = location;
		
	}
	
	//메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***"+location+" Tire 펑크 ***");
			return false;
		}
	}
	
}

