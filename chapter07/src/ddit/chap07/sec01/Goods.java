package ddit.chap07.sec01;

//�θ� Ŭ����
public class Goods {
	//��� ��Ű���� �ֵ� ������� �������� ���� ����
	protected int price;
	protected int bonusPoint;
	
	Goods(int price){
		this.price = price;
		bonusPoint = (int)(price*0.01);
	}
}
