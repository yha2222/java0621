package ddit.chap07.sec01;
//�� ��ǥ��
public class Point {
	private int x;
	private int y;
	
	//�Ű����� ���� ������ => �⺻ ������(�ȿ� �ڵ� �ְ� ����� ��� ����)
	Point(){
		//x = 0;
		//y = 0;
		
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//getLocation ���� toString �ᵵ ��
	public String getLocation() {
		return "(" + x + ", " + y + ")";
	}
}
