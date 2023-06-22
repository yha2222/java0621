package ddit.chap07.sec01;

public class Point {
	private int x;
	private int y;
	
	Point(){
		//x = 0;
		//y = 0;
		
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "(" + x + ", " + y + ")";
	}
}
