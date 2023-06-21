package ddit.chap07.sec02;
//자식클래스 - 학생클래스(Student)
//속성 : 국어(kor), 영어(eng), 수학(mat) 성적
//매서드 : 생성자, 총점과 평균을 구하는 메서드(calculateScore())
//		, 성적표 출력 메서드(printScore()) - 부모클래스 getName() 사용

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
		System.out.println("국어: "+kor+" |영어: "+eng+" |수학: "+mat);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
	}
}
