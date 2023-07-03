package pddit.chap07.sec09;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog("포유류");
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println(cat.kind); 
		System.out.println(dog.kind);
		System.out.println("------");
		
		Animal animal = null;
		animal = new Dog("설치류");
		animal.sound();
		System.out.println(animal.kind); 
		
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		Animal animal1 = new Dog("포유류");
		animal.sound();
		animal1.sound();
		
		//animalSound(new Cat());
		//animalSound(new Dog("d"));
		
	}
	
	//public static void animalSound(Animal animal) {
	//	animal.sound();
	//}

}
