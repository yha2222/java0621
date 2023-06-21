package ddit.chap07.sec02;

public class PersonExample {

	public static void main(String[] args) {
		Student sd = new Student();
		sd.name = "ȫ�浿";
		sd.age = 17;
		sd.kor = 90;
		sd.eng = 90;
		sd.mat = 90;
		sd.calculateScore();
		sd.printScore();

	}

}
