package ddit.chap07.sec04;

public class OverrideTest01 {

	public static void main(String[] args) {
		new OverrideTest01().start();

	}
	
	public void start() {
		Parent p1 = new Parent("홍길동");
		System.out.println("Object클래스 toString() : " + super.toString());
		System.out.println("자식클래스 toString() : " + p1.toString());
	}

}
