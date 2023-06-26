package ddit.chap07.sec08;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		System.out.println(dog.kind);
		
		Tiger tiger = new Tiger();
		
		Sparrow sparrow = new Sparrow("조류");  //kind 가지고 감
		//자식 클래스 따로 관리 힘듦
		//==> upcasting : 고정된 변수명
		Animal animal = new Sparrow("조류"); 
	}

}
