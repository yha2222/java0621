package ddit.chap07.sec08;

public class Sparrow extends Animal {
	//재정의 하지 않으면 상속 받은 애도 추상이어야 함
	Sparrow(String kind){
		super(kind);
	}//public abstract void sound();


	 @Override
	 public void sound() {
		 System.out.println("짹짹");
	}

}
