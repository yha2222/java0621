package ddit.chap07.sec01;

public class PracExample {

	public static void main(String[] args) {
		Prac02 circle = new Prac02(10, "파란색", "원", new Prac03(800, 500));
		
		circle.draw();
		circle.getArea();

	}

}
