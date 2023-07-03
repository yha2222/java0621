package ddit.chap07.sec01;

public class PracExample {
//cArExample
	public static void main(String[] args) {
		Prac02 car = new Prac02();
		
		for(int i = 1; i<=5; i++) {
			
			int problemLocation = car.run();  
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new Prac04("앞왼쪽", 15); //자동 타입 변환 => 재정의된 roll()
				break;
			
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new Prac03("앞오른쪽", 13); //자동 타입 변환
				break;
			
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new Prac04("뒤왼쪽", 14);  //자동 타입 변환
				break;
			
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new Prac03("뒤오른쪽", 17);  //자동 타입 변환
				break;
			}
			
			System.out.println("--------------------------------");
			
		}
	}

}
