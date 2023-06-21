package ddit.chap07.sec01;
//점 좌표점
public class Point {
	private int x;
	private int y;
	
	//매개변수 없는 생성자 => 기본 생성자(안에 코드 있고 없고는 상관 없음)
	Point(){
		//x = 0;
		//y = 0;
		
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//getLocation 말고 toString 써도 됨
	public String getLocation() {
		return "(" + x + ", " + y + ")";
	}
}
