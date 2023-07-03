package pddit.chap07.sec09;

public class Cat extends Animal {
	public Cat() {
		super("포유류");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
