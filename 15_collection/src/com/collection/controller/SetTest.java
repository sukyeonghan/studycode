package com.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.collection.model.vo.Member;

public class SetTest {

	public void setTest() {
		//set�� ���� �˾ƺ���
		//Ư¡ : ������ ����, �����͸� ������ �� �ִ� �����ڰ� ����(���� ȣ��Ұ�), �ߺ��� ���� �Ұ���
		//���� : HashSet,TreeSet
		//��ü������� �޼ҵ带 ȣ���ؼ� ����, ȣ��...
		HashSet set = new HashSet();
	
		//������ ����
		//add(��)�޼ҵ� ��� - List�� ����
		set.add("����ȣ");
		set.add("����");
		set.add("�����");
		set.add("�̼���");
		set.add("Ȳ��ȣ");
		set.add("������");
		
		//set�� ����� �����ʹ� �����͸� ������ �� �ִ� �����ڰ� ���� ������
		//��� �ڷḦ �ҷ��� �� �ִ� ��ü(Iterator)�� �̿��ؼ� �����.
		Iterator it = set.iterator(); //set�� ������ �ִ� ��� ��ü�� �Ѱ���
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);//�̷��� ����ض�~
			//���� ��� �� �� �ں��� ����
			//1,3..�̷��� ����
			//System.out.println(it.next());
			//2������ 2���� �ҷ���. Ȧ���� ���� NoSuchElementException ���� ��
			//2,4..�̷��� ����
			//��� �� ����! ��ūó��.
			//���� �Ұ��� Iterator it2=set.Iterator();ó�� �ٽ� �־���� ��
			
		}
		
		//set ����� �̼����� ã������
		Iterator it2 = set.iterator();
		while(it2.hasNext()) {
			Object o = it2.next();
			if(o.equals("�̼���")) { 
				System.out.println(o); //�� �� next�ϸ� ���� ����� �����Ƿ� �̷��� �ؾ� ��
			}
		}
		
		System.out.println("=== for each�̿� ===");
		//set�� �ִ� ��ü ��ü�� ��ȸ�� ����
		//for each�� ��밡��
		for(Object o : set) {
			System.out.println(o);
		}
		
		//set �ߺ��� ������ �ɱ��? �ȵ�
		
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		set.add("����ȣ");
		
		//��ü ����ϱ�
		Iterator it3 = set.iterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		//�ζ� �ߺ��� ����
		HashSet lotto = new HashSet();
//		for(int i=0; i<7; i++) {
//			lotto.add((int)(Math.random()*45)+1);
//		}
		while(true) {
			lotto.add((int)(Math.random()*45)+1);
			if(lotto.size()==7) {
				break;
			}
		}
		for(Object o : lotto) {
			System.out.print(o+ " ");
		}
		System.out.println();
		
		//set�� �ִ� �����͸� Ȯ�� �� �� ����
		//size()�޼ҵ带 ���ؼ� ������
		lotto.clear();
		if(lotto.size()==0) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		
		//set�� ���� ���� ��ü�� �־��
		//Member Ŭ������ �����. id,pw,name,age 
		//id�� �ߺ��Ǹ� ���� �ʰ� �ְ� ���
		//1. admin,1234,������,19
		//2. user01,1111,����1,20
		//3. user02,2222, ����2,21
		//4. user03,3333,����3,22
		//5. admin,1234,������,19
		Set members = new HashSet();

		members.add(new Member("admin","1234","������",19));
		members.add(new Member("user01","1111","����1",20));
		members.add(new Member("user02","2222","����2",21));
		members.add(new Member("user03","3333","����3",22));
		members.add(new Member("admin","1234","������",19));
		//���� ������ ���� �ϱ� ���� �������̵� �ؾ� ��
		
		for(Object o : members) { //���� ���ִ� members�� ȣ��(�������ε�)
			System.out.println(o);
		}
		
		//set ������ ����
		//��ü ����(clear), �Ϻ� ���� - remove(��ü);
		members.remove(new Member("user01","5555","������",20)); 
		//��ġ�ϴ� ��-id,age��ġ�ϴ� �� ����- �ΰ��� ������ ���� �Ŷ�� �����س����ϱ�
//		System.out.println("=== ���� �� ===");
//		for(Object o : members) { 
//			System.out.println(o);
//		}
		
		System.out.println("=== Iterator�� ��Ȱ���� �Ұ��� ===");
		//������ �̹� ��� Iterator�� �ٽ� Ȱ���Ϸ��� ���Ҵ��������
		it = members.iterator();
		System.out.println(it.next()); //for�� �ȵ������ϱ� �ϳ��� ���
		//for each��  Iterator �� �� ����ؼ� ��� ������. ���� iterator�� ������
		//Iterator�� �ϳ��� ����
		//for each�� ������ ��ü �� ���
		
		//Set,List�� Collection �ڽ���
		//set <--> List ���� ȣȯ�� ����!
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//set�̿��ؼ� �ߺ� ����
		//HashSet temp = new HashSet(list);
		//list = new ArrayList(temp);
		list = new ArrayList(new HashSet(list)); //�� �ٷ� ����
		System.out.println(list);
	}
	
}
