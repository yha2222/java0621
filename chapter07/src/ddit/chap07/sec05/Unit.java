package ddit.chap07.sec05;

public class Unit {
	int x = 100;
	int y = 100;
	String name;
	
	Unit(String name){
		this.name = name;
	}
	
	public void stop() {
		System.out.println(name + "이 좌표 " + x + ", " + y + ")에 멈춤니다.");
	}
	public void move(int x, int y) {
		
	}
}

class Marine extends Unit{
	Marine(){
		super("해병");
	}
	
	@Override
	//접근지정자(원본보다 같거나 넓게) 빼고 시그니처 무조건 똑같이
	public void move(int x, int y) {
		System.out.println(name + "이 ("+ this.x+", "+this.y+")에서 "+
					"좌표(" + x + ", " + y + ")로 걸어서 이동합니다.");
	}
	
	public void stimPack() {
		System.out.println("공격모드: 스팀팩 장전");
	}
}

class Tank extends Unit{
	Tank(){
		super("탱크");
	}
	
	@Override
	//접근지정자(원본보다 같거나 넓게) 빼고 시그니처 무조건 똑같이
	public void move(int x, int y) {
		System.out.println(name + "가 좌표(" + x + ", " + y + ")로 이동합니다.");
	}
	
	public void sizaMode() {
		System.out.println("공격모드: 시즈모드로 전환");
	}
}
