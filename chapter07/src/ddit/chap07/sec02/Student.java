package ddit.chap07.sec02;
//(Student)
//(kor), (eng), (mat) 
//(calculateScore())
//		(printScore()) - �getName()

public class Student extends Person {
	int sum;
	double avg;
	int kor;
	int eng;
	int mat;
	
	Student(){}
	Student(String name, int age, int kor, int eng, int mat){
		super(name, age);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public void calculateScore() {
		sum = kor + eng + mat;
		avg = (kor + eng + mat)/(double)3;
	}
	
	public void printScore() {
		getName();
		System.out.println("국어 : "+kor+" | 영어: " + eng + " | 수학: " + mat);
		System.out.println("총점: "+sum);
		System.out.println("평균: " + avg);
		
	}
}
