package com.collection.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.collection.model.vo.Member;

public class MapTest {

	public void mapTest() {
		//Map : ��ü �����͸� �����ϴ� Ŭ����
		//������ - key : value ���������� �Ǿ�����(���߿� ������� �� �˾Ƶα�)
		//key �ڷ��� : Object; -> �ַ� String,Integer�� ���� ���. �����ڿ���
		//value �ڷ��� : Object -> ��� ��ü ���
		//���� : HashMap, TreeMap,LinkedHashMap;
		
		//Ŭ�����⶧���� �޼ҵ带 �̿��ؼ� �����͸� ó����
		
		//����
		HashMap map = new HashMap();
		//Map�ڷ����� ���� �ִ� ���
		//put(key,value);
		map.put(1,"������");
		map.put(2,"�輼��");
		map.put(3,"���׷���");	
		
		//key,value���� ��� ��ü�� �� �� ����
		map.put("���", "������");
		map.put("admin", new Member("admin","1234","������",19));	
		map.put(new Member("user01","1111","����1",20),1);
		
		//map�� �� �ִ� ���� ����ϱ�
		//get(key); -> value���� ������ �� ����
		System.out.println(map.get(1));
		System.out.println(map.get("admin"));
		System.out.println(map.get(new Member("user01","1111","����1",20)));
		//��� ���Ϸ��� �������������̵�, �ؽ��ڵ� �־�� ��
		
		//web���� ����Ʈ�ܿ��� ������ ���� key:value �������� �������� ��!
		//request.getPatameter("userId");  key : value �������� ����ϴ� �� �˾Ƶ���
		
		//map -> listƯ��, setƯ���� �� �� ������ ����
		//key�� �ߺ� �ȵ�!
		//key�� Set������� ������
		//map�� �����ϰ� �ִ� key��ü�� ����Ϸ��� Set���� �޾ƿͼ� ����ؾ���.
		System.out.println("=== key�� ��� ===");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		
		//key�� ���
//		while(it.hasNext()) {//���ִ��� Ȯ��
//			System.out.println(it.next()); // �� ���� ������
//		}
		
		//key�� value��  ��ü ���
		while(it.hasNext()) {
			Object key = it.next();
			System.out.println(key+" : "+map.get(key)); // get�� key�� ������ value��
			//System.out.println(map.get(key)); //���� ���
		}
		System.out.println("==== Map.Entry ��ü�� ��� ====");
		
		//��ü ����ϴ� �ٸ� ���
		//Map.Entry ��ü�� �̿��ؼ� �� ���� key,value���� �����
		Set mapEntry = map.entrySet();//entrySet�� key,value���� ������� ����
		Iterator it2 = mapEntry.iterator(); //���� ���ļ� mapEntry��� ��ü�� �ѱ�
		//iterator�ϴϱ� Ʈ���� �ȿ� �ϳ��� ��. �̰� �ڷ����� mapEntry
		while(it2.hasNext()) {
			//System.out.println(it2.next());
			
			Map.Entry entry = (Map.Entry)it2.next();
			//Map.Entry��ü �ȿ� key�� value���� ���ÿ� �����ϰ� ����
			//key�� : Map.Entry.getKey();
			//value�� : Map.Entry.getValue():
			System.out.println("key : "+entry.getKey());
			System.out.println("value : " +entry.getValue());
		}
		
		//Ű����������
		System.out.println("=== for each������ ó���ϱ� ===");
		for(Object o : map.keySet()) {
			
			System.out.println(o);
			System.out.println(map.get(o)); //value��
		}
		
		for(Object a : map.entrySet()) {
			Map.Entry entry = (Map.Entry)a;
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		} //�̷��Ե� ����
		
		
		//map��ü �����ϰ� Ȱ���ϱ�
		HashMap members = new HashMap();
		//member ��ü 3�� �ֱ�
		members.put(1,new Member("tnrud","4567","user",23));
		members.put(2,new Member("admin","1234","������",19));
		members.put(3,new Member("adm3","1267","�Ŵ���",34));
		
		//����� ����� id�� ����ϱ�
		//iterator//�� ����ȯ��..����!
		
		Set memKey = members.keySet();
		Iterator it3 = memKey .iterator();
		while(it3.hasNext()) {
			//it3.next()//key��
			Object o = members.get(it3.next()); //value��
			System.out.println(((Member)o).getId()); 
			
		}
		
		//entrySet
		Set memEntry = members.entrySet();
		it3 = memEntry.iterator();
		while(it3.hasNext()) {
			Map.Entry en = (Map.Entry)it3.next();
			Member m = (Member)en.getValue();
			System.out.println(m.getId());
		}
		
		
		System.out.println("=== for each�� ===");
		
		for(Object o : members.keySet()) {
			Member m = (Member)members.get(o); //en.getValue(); �Ѵ� ���������� ���. ��� �ּ� �������ϱ�
			System.out.println(m.getId());
			
			//System.out.println(((Member)members.get(o)).getId());
			//�� �ٷ� ����
		}
		
		//map�� key���� �ߺ��� �ȵȴ�
		
		System.out.println(members.get(1));
		members.put(1, "�̰� ��� �Ǵ�?");
		System.out.println(members.get(1));//����� �ȴ�
		
		//value���� �ߺ��� �ȴ�
		members.put(4, new Member("tnrud","4567","user",23));
		members.put(5, new Member("tnrud","4567","user",23));
		members.put(6, new Member("tnrud","4567","user",23));
		
		System.out.println(members);
		
		//map ��ü ���� Ȯ�� ����
		System.out.println(members.size());
		
		//key���� �ִ��� value���� �ִ��� Ȯ���ϴ� ��
		//containsKey() / containsValue();
		System.out.println(members.containsKey(1));
		System.out.println(members.containsKey(5));
		System.out.println(members.containsValue(new Member("tnrud","4567","user",23)));
		
		//map�� �ִ� ������ �����
		members.remove(5);
		System.out.println(members);
		members.remove(6,new Member("tnrud","4567","user",23));
		System.out.println(members);
		members.clear();
	}
}
