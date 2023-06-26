package ddit.chap07.sec08;

public class Dog extends Animal {
	Dog(){
		super("포유류");  //kind 초기화됨
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}}
