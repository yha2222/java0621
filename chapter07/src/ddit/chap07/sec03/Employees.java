package ddit.chap07.sec03;
//다음 요구사항을 분석하여 클래스를 구성하시오
//1. 부모클래스 
//	1)사원클래스(employees)
//		- 속성 : 사원번호(empID:long)
//			       사원명(empName : String)
//			       월지급액(salary : int)

//따로 생성 없고 자식 클래스에서 super 의해 호출
public class Employees {
	//다른 패키지에서도 접근(public은 너무 광범위)
	protected long empID;
	protected String empName;
	protected int salary;
	
	Employees(){}
	Employees(long empID, String empName){
		this.empID = empID;
		this.empName = empName;
	}
	
	public void getInfo() {
		System.out.println("-------------------------");
		System.out.println("아이디: " + empID);
		System.out.println("이름: " + empName);
	}
}
