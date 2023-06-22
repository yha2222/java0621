package ddit.chap07.sec01;

public class Shape {
	String color;
	String kind;
	
	Shape(){}
	Shape(String color, String kind){
		this.color = color;
		this.kind = kind;
	}
	
	public void draw() {
		System.out.println(color + "������ " + kind + " ������ �׸���.");
	}
	
}
