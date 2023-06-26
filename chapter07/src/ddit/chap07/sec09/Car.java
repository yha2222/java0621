package ddit.chap07.sec09;

public class Car {
//	Tire frontLeftTire = new Tire(5, "앞왼쪽");
//	Tire frontRightTire = new Tire(3, "앞오른쪽");
//	Tire backLeftTire = new Tire(6, "뒤왼쪽");
//	Tire backRightTire = new Tire(4, "뒤오른쪽");

	Tire[] tire = new Tire[4];

	Car(Tire[] tire){
		this.tire = tire;
	}
	
	int run() {
		for(int i = 0; i < tire.length; i++) {
			if(tire[i].roll() == false) { 		//누적회전수 비교
				stop();
				return i;
			}
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춤니다.");
	}
}
