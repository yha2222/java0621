package ddit.chap07.sec04;

public class Parent extends Object {
	String name;
	
	Parent(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
