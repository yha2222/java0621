package ddit.chap07.sec01;

public class Shape {
	String color;
	String kind; //도형 종류
	
	Shape() {}
	Shape(String color, String kind){
		this.color = color;
		this.kind = kind;
	}
	
	public void draw() {
		System.out.println(color + "색상의 " + kind + " 도형을 그리다.");
	}
	
	//상속
}
