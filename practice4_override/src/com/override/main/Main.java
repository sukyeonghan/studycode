package com.override.main;

import com.override.model.vo.Cat;
import com.override.model.vo.Chicken;
import com.override.model.vo.Lion;

public class Main {
	
	public static void main(String[] args) {
		//Animal�� ��ӹ޾�
		//action()�� ȣ���ϸ� ���� ��Ʈ ������ �ϱ�
		//���, ���� �� �ʱ�ȭ��Ű�� 
		
		Cat c = new Cat("�θ�","������",4);
		Lion l = new Lion("����","������",4);
		Chicken ch = new Chicken("ó����","����",2);
		
		System.out.println(c.action());
		System.out.println(l.action());
		System.out.println(ch.action());
		
	}

}
