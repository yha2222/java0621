package ddit.chap07.sec09;

public class CarExample {

	public static void main(String[] args) {
		Tire[] tire = {new HankookTire(5, "앞왼쪽"), new KumhoTire(3, "앞오른쪽"),
				new KumhoTire(6, "뒤왼쪽"), new HankookTire(4, "뒤오른쪽")};
		Car car = new Car(tire);
		
		for(int i=0; i<tire.length; i++) {
			int problemLocation = car.run();
			switch(problemLocation+1) {  //0번째 인덱스
			case 1: 
				System.out.println("앞쪽 왼쪽 타이어 한국타이어로 교체");
				car.tire[0] = new HankookTire(10,"앞왼쪽");
				break;
			case 2: 
				System.out.println("앞쪽 오른쪽 타이어 금호타이어로 교체");
				car.tire[0] = new KumhoTire(12,"앞오른쪽");
				break;
			case 3: 
				System.out.println("뒤쪽 왼쪽 타이어 금호타이어로 교체");
				car.tire[0] = new KumhoTire(17,"뒤왼쪽");
				break;
			case 4: 
				System.out.println("뒤쪽 오른쪽 타이어 한국타이어로 교체");
				car.tire[0] = new HankookTire(17,"뒤오른쪽");
				break;
			}
			System.out.println("----------------------");
		}

	}

}
