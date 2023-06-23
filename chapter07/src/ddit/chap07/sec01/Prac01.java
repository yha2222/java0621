package ddit.chap07.sec01;
//다음 요구사항을 분석하여 클래스를 구성하시오
//1. 부모클래스 
//	1)사원클래스(employees)
//		- 속성 : 사원번호(empID:long)
//			       사원명(empName : String)
//			       월지급액(salary : int)
public class Prac01 {
	//employees
	protected long empID;
	protected String empName;
	protected int salary;
	
	Prac01(){}
	Prac01(long empID, String empName){
		this.empID = empID;
		this.empName = empName;
	}
	
	public void printInfo() {
		System.out.println("------------------------");
		System.out.println("아이디: " + empID);
		System.out.println("이름: " + empName);
	}
	
}
