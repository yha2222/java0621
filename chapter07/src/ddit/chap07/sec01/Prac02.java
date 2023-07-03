package ddit.chap07.sec01;

public class Prac02 {
	//Car
	//필드
	Prac01 frontLeftTire = new Prac01("앞왼쪽", 6);
	Prac01 frontRightTire = new Prac01("앞오른쪽", 2);
	Prac01 backLeftTire = new Prac01("뒤왼쪽", 3);
	Prac01 backRightTire = new Prac01("뒤오른쪽", 4);
	
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}
