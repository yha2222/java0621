package ddit.chap07.sec01;

public class Prac01 {
	String color;
	String kind;
	
	Prac01(){}
	Prac01(String color, String kind){
		this.color = color;
		this.kind = kind;
	}
	
	public void draw() {
		System.out.println(color + " ������ " + kind +"���� �׸���");
	}
}
