package com.collection.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.collection.model.vo.Sports;

import common.sort.NumberSort;
import common.sort.SportPlayerSort;
import common.sort.StringSort;

public class ListTest {
	
	public void arrayListTest() {
		
		
		
		//List�� ���� �˾ƺ��� - �������̽�!(�߻�޼ҵ� ������ ����, ��� �� ����)
		//Ư¡ : �迭�� ������ �ڷᱸ���� ������ ����
		//  -> index���� ������ ����. ������ ����. �ߺ����� ������ �� ����
		//���� : ArrayList, LinkedList,Vector
		
		//ArrayList
		
		//��ü�� �����ϴ� ������ ������ Ŭ���� == object[]������� ����
		//Ŭ������ ����(�ν��Ͻ�ȭ)�Ͽ� Ȱ�� ��
		ArrayList list = new ArrayList();
		//Ȱ���ϴ� ����� �迭�� ���� �����!
		//�迭�� ����̳� ����[]�� �̿�
		//List�� ��ü�̱� ������ �޼ҵ带 �̿��ؼ� ó����
		
		//List�� ���� �ִ� ��� - add(��ü)�޼ҵ带 �̿�
		list.add("������"); //0��
		//add�޼ҵ�� ���� ������ ���������� 0�� �ε������� ���� ���Ե�
		list.add("����"); //1��
		
		//List�� �پ��� ��ü�� ������ �� ����
		list.add(new GregorianCalendar()); //2
		list.add(new Scanner(System.in)); //3
		
		//List�� ����� ��ü ����ϱ�
		//get(�ε���)�޼ҵ带 �̿�
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		//list.get() => ������ => ��ü�� �ּҰ� �� �ִ�
		//object������ ������ �ϰ� �ֱ� ������-�ڷ����� ���缭 ����ȯ�ؾ���!
		System.out.println(((String)list.get(0)).charAt(0));
		
		//�ݺ����� Ȱ���ؼ� �����Ϳ� �����Ͽ� ó���� �� ����.
		int[] a = new int[10]; //a.length-��������� ����
		//list�� ���̴�?? -> list.size();
		System.out.println(list.size()); //list�� ���� ���ԵǾ� �ִ� ��ü�� ��!
//		list=new ArrayList();
//		System.out.println(list.size());//���� �����ؼ� 0�� ����
		
		//for������ ��� 
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//list������ �� GregorianCalendar ��ü��, �⵵ ���!
		for(int i=0;i<list.size(); i++) {
			if(list.get(i) instanceof GregorianCalendar) {//object�ϱ� 
				GregorianCalendar gc = (GregorianCalendar)list.get(i);
				System.out.println(gc.get(Calendar.YEAR));
		
			}
		}
		
		//List �������̽��� ���� -> ArrayList�ϱ� (���)
		List sports = new ArrayList();
		//���� �����ϴ� ������ 4���� �����غ���-��Ģ ����
		sports.add(new Sports("��������","�౸",11,new String[5]));//�Ҵ縸�ص� ��
		//sports.get(0) = new Sports("��������","�౸",11,null));
		sports.add(new Sports("��������","�߱�",9,null));
		sports.add(new Sports("�ⱸ�","�ｺ",1,null));
		sports.add(new Sports("������","����",8,null));
		
		//for������ ��ü ����ϱ�
//		for(int i=0;i<sports.size(); i++) {
//			System.out.println(sports.get(i));
//		}
		//for each������ ���
		for(Object o : sports) {
			System.out.println(o);
		}
		
		//������ ���������� �������� ����ϱ�
		for(int i=0; i<sports.size(); i++) {
			if(sports.get(i) instanceof Sports) {
				//sports.get(i)�� ����. return���� Object
			Sports gs = (Sports)sports.get(i);
			if(gs.getType().equals("������")) {
				System.out.println(gs);
				}
			}
		}
		
		for(Object o : sports) {
			if(o instanceof Sports) {
				Sports s = (Sports)o;
				if(s.getType().equals("��������")) {
					System.out.println(s);
				}
			}
			
		}
		
		//list�� ���ϴ� ��ġ�� �ս��� �����͸� ���� �� ����
		//add(index,data); index��ġ�� data�� ����!
		System.out.println("==== ���ϴ� ��ġ�� ���ֱ� ====");
		System.out.println(sports.get(2));
		sports.add(2,new Sports("��������","��",5,null));//�ڵ����� �ϳ��� �и�
		System.out.println(sports.get(2));
		System.out.println(sports.get(3));
		
		//list�� Ư����ġ�� ���� ������ ���� ����
		//set(index,data); Ư�� ��ġ�� ���� ����!
		System.out.println("==== Ư����ġ �� �����ϱ� ====");
		System.out.println(sports.get(sports.size()-2));
		//�ε����� ����-1�̴ϱ� �� ������ ���� ȣ����
		sports.set(sports.size()-2, "���� ��Ϳ�??");
		System.out.println(sports.get(sports.size()-2));
		//���� ��Ϳ�?? �� �ٲ�� ���� �ִ� �ｺ ������ �����
		System.out.println(sports.get(sports.size()-1));
		//��ü ��½� �̷��� �ص� ��(toString ȣ��)
		System.out.println(sports);
		
		//list�� �����Ͱ� �ִ��� ������ Ȯ�� ���?
		
		//������ �� ���� �� ����� ��
//		sports.clear();
				
//		if(sports.size()>0) {
//			System.out.println("������ �ִ�.");
//		} else {
//			System.out.println("������ ����.");
//		}
		
		//isEmpty() �÷����� ����ִ��� ����
		if(!sports.isEmpty()) {
			System.out.println("������ �ִ�.");
		} else {
			System.out.println("������ ����.");
		}
		
		//���ϴ� �����͸� �����غ���
		//remove(index);
		System.out.println(sports.size());
		sports.remove(3);
		System.out.println(sports.size());
		System.out.println(sports.get(3));//����! ������ ������!
		//System.out.println(sports.get(5));//5�� �ε��� ����
		
		//remove(��ü);
		System.out.println("����� �� ����");
		System.out.println(sports.size());
		sports.remove(new Sports("��������","�౸",11,new String[5]));
		System.out.println("���� �� ����");
		System.out.println(sports.size()); //�׳� �̷����ϸ� �ȵ�~
		//�ش� ��ü�� @Override equals() �ؾ���
		//sport.get(1).equals(new...)
		
		System.out.println(sports.get(0));
	
		
		//list���ο��� Ư�� ��ü�� ã�� �޼ҵ�
		//contains() - ����� true/false�� ����
		System.out.println(sports.contains(new Sports("������","����",8,null)));
		System.out.println(sports.contains(new Sports("��������","�౸",11,new String[5])));
		
		//list�� �ߺ��� ���� ����
		list = new ArrayList();
		for(int i=0; i<10; i++) {
			list.add("������");
		}
		for(Object n : list) {
			System.out.println(n);
		}
		
	}
	
	//list���� �ε����� �������� ������ �����Ѵ�!
	//�׷��� ������?
	public void listSort() {
		//list�ڷ� �����غ���
			
		List nums = new ArrayList();
		for(int i=0; i<10; i++) {
			nums.add((int)(Math.random()*30+1));
		}
//		for (Object o : nums) {
//			System.out.println(o);
//		}
		printList(nums);
	
		//�������� ����
		Collections.sort(nums);
		System.out.println("=== �������� ���� �� ===");
		printList(nums);
		
		//�������� ���� ���
		//1. ���������� ���� ��ü�� ���� -> Comparator�������̽� ����
		//������ Ŭ�������� ���� �� ���. compare() �߻�޼ҵ� ����
		//2. ��ü ���ο��� ���ļ����� ���ϴ� ��� -> comparable �������̽��� ���� 
		//������ ������ ��ü���� ���. compareTo() ����
		
		//1. Comparator
		Collections.sort(nums, new NumberSort());
		System.out.println("=== �������� ���� �� ===");
		printList(nums); 
		//������
		//������ ��ü ������ ������ �������� �ʰ� ���ذ�(�Ǻ�)�� �߽����� ���� �κ����հ� ������ �κ��������� ����.
	
		System.out.println("==�������� ���� �͸�Ŭ����==");
		Collections.sort(nums, new Comparator() {
			
			@Override
			public int compare(Object o1,Object o2) {
				return ((Integer)o2)-((Integer)o1);
			}
		});
		printList(nums);
		
		System.out.println("===�������� ���� ���ٽ� ===");
		Collections.sort(nums,(o1,o2)->
		((Integer)o2)-((Integer)o1));
		printList(nums);
		
		
		//���ڿ� �����ϱ�
		nums.clear();
		nums.add("������");
		nums.add("������");
		nums.add("Ȳ��ȣ");
		nums.add("����ȣ");
		nums.add("�����");
		nums.add("������");
		System.out.println("==== ���ڿ� �����ϱ� ====");
		printList(nums);
		
		//���ڿ� ��������
		Collections.sort(nums);
		System.out.println("=== ���ڿ� �������� ���� �� ===");
		printList(nums);
		
		//���ڿ� ��������
		Collections.sort(nums, new StringSort());//���� ��ü �ֱ�
		System.out.println("=== �������� ���� �� ===");
		printList(nums);
		
		//��ü�� �� �ִ� list�����ϱ�
		nums.clear();
		nums.add(new Sports("��������","�౸",11,null));
		nums.add(new Sports("��������","��",5,null));
		nums.add(new Sports("�ｺ","�ｺ",1,null));
		nums.add(new Sports("��������","�״Ͻ�",2,null));
		nums.add(new Sports("��������","����",9,null));
		
		System.out.println("=== ���� �� ===");
		printList(nums);
		//Collections.sort(nums);//compareTo�޼ҵ尡 �־�� ��
		//Collections.sort(nums, new SportPlayerSort()); //Comparator�̿�
		Collections.sort(nums, new SportPlayerSort(true));//����
		System.out.println("=== ���� �� ===");
		printList(nums);
		
		Collections.sort(nums, new SportPlayerSort(false));//����
		System.out.println("=== ���� �� ==="); 
		printList(nums);
		
		
		//�͸�Ŭ������ �̿��ؼ� �����ϱ�. �ӽ�Ŭ����(��Ī��� �ٽ� ���θ�)
		System.out.println("=== �͸�Ŭ���� ===");
		Collections.sort(nums, new Comparator() {//�������̽�
			
			@Override
			public int compare(Object o1,Object o2) {
				
				return ((Sports)o2).getPlayer()-((Sports)o1).getPlayer();
			}
		});//�ٷ� �����ؼ� �������!
		printList(nums);
		
		//���ٽ��� �̿��ؼ� �����ϴ� ��
		System.out.println("==== ���ٽ� ====");
		Collections.sort(nums,(o1,o2)->
		(((Sports)o2).getPlayer()-((Sports)o1).getPlayer()));
		printList(nums);
	}
	

	public void printList(List list) {
		//����Ʈ�ϴ� �޼ҵ�
		for(Object o : list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	
	
	//LinkedList
	public void linkedList() {
		// ArrayList�� ���-�������� ����
		LinkedList list = new LinkedList();
		
		//������
		list.add("������");
		list.add("����ȣ");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.getFirst());//���� ó�� ���
		System.out.println(list.getLast());//���� ������ ���
		
		list.add(1,"������");//����, ���� �� �ӵ��� �� ����
		list.remove(1);
	}

}
