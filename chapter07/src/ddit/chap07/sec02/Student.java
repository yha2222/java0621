package ddit.chap07.sec02;
//�ڽ�Ŭ���� - �л�Ŭ����(Student)
//�Ӽ� : ����(kor), ����(eng), ����(mat) ����
//�ż��� : ������, ������ ����� ���ϴ� �޼���(calculateScore())
//		, ����ǥ ��� �޼���(printScore()) - �θ�Ŭ���� getName() ���

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
		System.out.println("����: "+kor+" |����: "+eng+" |����: "+mat);
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
	}
}
