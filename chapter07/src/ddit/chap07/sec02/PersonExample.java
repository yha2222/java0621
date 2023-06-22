package ddit.chap07.sec02;

public class PersonExample {

	public static void main(String[] args) {
		Student sd = new Student("홍길동", 17, 88, 65, 20);
		//sd.name = "홍길동";
		//sd.age = 17;
		//sd.kor = 90;
		//sd.eng = 90;
		//sd.mat = 90;
		sd.calculateScore();
		sd.printScore();

	}

}
