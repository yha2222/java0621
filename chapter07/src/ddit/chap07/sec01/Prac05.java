package ddit.chap07.sec01;

public class Prac05 extends Prac01 {
	//Circle
	int radius;
	Prac03 center;
	
	Prac05(){
		center = new Prac03();
	}
	
	Prac05(int radius, Prac03 center, String color, String kind){
		super(color, kind);
		this.radius = radius;
		this.center = center;
	}
	
	public void getArea() {
		double rad = radius * radius * 3.1415926;
		System.out.println("반지름: " + radius);
		System.out.println("원 넓이: " + rad);
		System.out.println(center.getLocation());
	}
}
