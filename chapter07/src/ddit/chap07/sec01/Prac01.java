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
		System.out.println(color + " 색상인 " + kind +"형을 그린다");
	}
}
