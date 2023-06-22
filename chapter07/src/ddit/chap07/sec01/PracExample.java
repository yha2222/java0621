package ddit.chap07.sec01;

public class PracExample {

	public static void main(String[] args) {
		Prac05 circle = new Prac05(15, new Prac03(100,300), "파란색", "원");
		circle.draw();
		circle.getArea();
	}

}
