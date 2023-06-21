package ddit.chap07.sec01;

public class Prac03 {
	private int x;
	private int y;
	
	Prac03(){
		this(0,0);
	}
	
	Prac03(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		return "(" +x+ ", " +y+ ")";
	}
}
