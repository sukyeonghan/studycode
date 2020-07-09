package com.frameTest.view;

import javax.swing.JFrame;

public class InheritFrame extends JFrame{
	
	public InheritFrame() { //�⺻������
		//�������̳� �⺻ container�� ����� Ŭ������ 
		//�����ڿ��� ��� ������ ������.
		
		//������ �⺻ ���� 3����
		//1.������ ��ġ, ũ�� ���� -> setBounds();
		setBounds(100,100,800,1000);//setBounds�� JFrame��
		//�� 2���� ��ġ(x,y). ��ġ �� ������ ���� ���. �� �� ���� 0,0
		//�� ���� ����(����width),����(����height)
		
		//2.â�� �ݴ� �̺�Ʈ ���� -> setDefaultCloseOperation
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//���� �̷��� �����. JFrame.EXIT_ON_CLOSE ����̿��� ��������

		//3.�����Ӱ�ü�� �⺻������ �Ⱥ��̰� ���� �Ǿ� ����
		//setVisible() ���̰� �����ϱ�
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new InheritFrame(); //������ �ϳ��� ����!
		
	}

}
