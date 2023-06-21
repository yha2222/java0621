package ddit.chap07.sec01;

public class Tv extends Goods {
	//�θ�Ŭ������ �Ű����� �����ϱ� �����ڿ� �˸��� ���·� �����ض�
	//Goods��� �޼ҵ� ������ ���� �� ��
	
	//int price - ��ӿ�
	Tv(int price){
		//Goods Ŭ���� ���� - �θ� �����ߴ� ��� �ٽ� ����
		super(price);
	}
	
	
	@Override
	public String toString() {
		return "ThinQ TV";
	}
}
