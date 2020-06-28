package com.override.model.vo;

public class Dog extends Animal {
	
	public Dog(String category, String name, char gender, String diet) {
		super(category, name, gender, diet);
	}
	
	//�������̵� ó���Ͽ� �°� ���� ������
	//�żҵ� ����δ� �θ��� �żҵ�� �����ϰ� �ۼ���
	//�����δ� �� ��ü�� �°� ������ ����
	//�޼ҵ� ����� ���� ������̼� override
	//�θ� �޼ҵ忡 bark�ִ��� �˻��ؼ� ������ ����ó��
	//Ȯ���ϱ� ���� ���� ����.
	
	@Override //����� Dog�� ���� ����� �޼ҵ尡 ��
	//���� public���� ��.animal�� �̹� public�̹Ƿ� �� ������ Ű�� �� ������ �� �۰Դ� �ȵ�
	public String bark() { 
		return "�۸�";
	}
	
	@Override
	public String info() { //������ ������ �ȴ�
		return "������";
	}
	
	@Override //�Ű����� �Ȱ��� �����. override �� �� ����δ� ������ �Ȱ��ƾ� �Ѵ�.
	public double calculator(int su,int su2) {
		return su*su2;
	}
}