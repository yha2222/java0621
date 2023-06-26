package ddit.chap07.sec09;

public abstract class Tire {
	public int maxRotation; //최대회전수(수명)
	public int accumulateRotation; //누적회전수(사용량)
	public String location; //위치
	
	Tire(int maxRotation, String location){
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public abstract boolean roll();
}
