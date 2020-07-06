package com.poly.main;

import java.util.Date;
import java.util.Scanner;

import com.poly.controller.Functional;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Duck;
import com.poly.model.vo.Employee;
import com.poly.model.vo.Lion;
import com.poly.model.vo.Person;
import com.poly.model.vo.Singer;

public class Main {
	
	public static void main(String[] args) {
		//������ Ȱ���ϱ�
		//�θ� Ÿ������ �����Ǿ� �ִ� ������
		//�ڽ� Ÿ���� ��ü�� ���� �� �� �ִ� ��!
		Cat tom = new Cat();
		Duck donald = new Duck();
		Animal ani = new Animal();
		
		ani = new Cat(); //������ //������ �ϳ��� ���� ���� ���� �� �ִٴ� ������ �ִ�
		System.out.println(ani);
		
		ani = new Duck(); //������
		System.out.println(ani);
		
		ani = new Lion(); //����! ��Ӱ��谡 ���� ������! �������� ������ �ȵ�.
		System.out.println(ani);
		//��� ���谡 ���� ������ ��!
		
		//�θ�� �ڽ� Ÿ���� ������ �� �� �ִ�?
//		tom = new Animal();//�θ�Ÿ���� �ڽ�Ÿ�Կ��� ���Ե� �� ����!
		
		//�������� ���� �ڽ� ��ü�� �θ� Ÿ������ ���ԵǸ�,
		//�θ�ü�� ���븸 �� �� �ְ� ������(��ĳ����)
		Person p = new Employee("����ȣ",48,"��õ","������","������",100);//person�� ô ��
		System.out.println(p.getName());
		//System.out.println(p.getDepartment());//�θ� ������ �ִ� �����͸� �� �� ����
		//�ڽ��� ������ �� �� ���� ��. ��3���� �� �� ���� �Ǿ� �̿��� �ʿ䰡 ���� ��.
	
		//Employee e = (Employee)p; //Employee�� p�� �����ϱ� ����ȯ�ؼ� �־� ��. ������ ���� ����
		
		//�θ�Ÿ������ ���Ե� �ڽİ�ü�� �����Ϳ� ������ �Ϸ���
		//�ݵ�� ��������ȯ�� �ؾ� ��!
		
		
		//��ȣ �ȿ� ����ȯ�� ��ü
		//������ �켱����! ()�� .���� �� ���� ����. ����ȯ �� �����ؾ��ؼ� ��ȣ�� ���� ����
		//����ȯ�ϸ� �������ִ� �� ������Ŵ..
		System.out.println(((Employee)p).getDepartment());
		p = new Singer("�輼��", 32, "������", "�ʸ� ���δ� ���̾�",2,"���");
		
		//Singer s = (Singer)p; 
		
		//functional ��ü���� �����ϴ� ��¸޼ҵ� �̿� ��ü ����ϱ�
		
		Employee e = new Employee("����ȣ",48,"��õ","������","������",100);
		Singer s = new Singer("�輼��", 32, "������", "�ʸ� ���δ� ���̾�",2,"���");
		//Employee e = (Employee)p;
		//Singer s = (Singer)p; �� ���� �ǹ�. ���� �Ȱ����ϱ�

		
		new Functional().print(e); //person�� �ڽ��̾ �Ű����� p�� �޾Ƶ� ���� �ȳ�
		new Functional().print(s);
		new Functional().print(new Person()); //p�� ���� ������ ������ ���, ������ ����
		
		//p���� singer�� ����
		//��� p�� person�ε� ���� �� �ִ� ��ü Ȯ��
		p=new Employee();
		System.out.println(p instanceof Employee);
		System.out.println(p instanceof Singer);
		
		
		//�θ�ü�� �̿��� ���� �ڽ� ��ü �����ϱ�
		//��ü�迭�� �����ϱ�
		Person[] persons = new Person[5];
		//���� Person ������ �ڽİ�ü�� ��� �� �� ����
		persons[0] = new Singer("�輼��",27,"��⵵ ������","�ʸ����δܸ��̾�",4,"����");
		persons[1] = new Employee("������",22,"����","������","������",100);
		persons[2] = new Person("����ȣ",32,"��������");
		persons[3] = new Singer("����",28,"����","��",10,"����");
		persons[4] = new Employee("�̼���",27,"����","������","������",20); 
		//persons�� ���α׷����� ��ϵǾ� �����ϰ� �ִ� ��ü ��θ� ����.������ �̿��ؼ�
		//-> �길 ������ ���� ���� �� �ִ�
		
		//���α׷��� ���� ��ϵǾ� �ִ� ������ ����� ����?
		System.out.println("=====");
		
		int singerCount = 0;
		int empCount = 0;
		
		for(int i=0; i<persons.length; i++) {
			if(persons[i] instanceof Singer) {
				singerCount++;
			} else if (persons[i] instanceof Employee) {
				empCount++;
			}
		}
		System.out.println("������"+singerCount+"�� ����");
		System.out.println("�����"+empCount+"�� ����");
		
		//object -> ��� Ŭ������ �θ�ü, �ֻ��� ��ü
		Object obj=new Person();
		System.out.println(obj); //Person�� ����- person�� toString ���
		obj=new Employee();
		
		Object[] objs = new Object[10];
		objs[0] = new Scanner(System.in);
		objs[1] = new Date();
		
		//objectŬ���� �ȿ��� �� ���� �� 
		//equals - ��ü ������ϴ� �޼ҵ�. ���ִ� ���� ��
		//�������̵��ؼ� �� �� �ִ�- public boolean equals(Object ob) ��� ��ü �� �� �� �ִ�
		//clone() - ��ü ����.���������� protected���� �������̵��ؼ� ����ض�
		//hashCode - equals�� ���� ��
		//toString �������̵��ϸ� ���ϴ´�� ����� �� ����. ��ü�� ���� ���� ���
		//�����ε��ؼ� ������� ������ Ŭ���� �̸��� 16���� hasCode�� ��ȯ
		//com.poly.model.vo.Employee@14ae5a5
		
		System.out.println(obj); //Employee��ü �� ���� - employee�� toString ���
		//Employee�� toString �������̵� �� �� ������ ���� ��ü�� person �� ȣ���ؼ� ���
		System.out.println(persons[0]); //�׳� �̷��� �ϸ� Object.toString();�� �ڵ����� ����
		
		//�θ�� ����Ǽ� ��ü�� ������ toString�� ������ �� ������
		//�ڽ� �͵� ������ �� �ְ� �ϴ°� '�������ε�'
		//person()���� �������̵��ߴµ� obj�� ���� �� ��µ�. Employee���� �������̵� ����
		//�ּҰ��� �ڷ����� �������� �������� �޼ҵ带 ȣ���� ��
		
		//���� ���ε� ����
		//�θ� ��ü�� ������ �ִ� �޼ҵ带 �ڽ� ��ü�� �������̵� �Ͽ��� �� 
		//����ȯ ���� �ڽ� ��ü�� �޼ҵ带 ������ �� �ִ� ��
		
		//���� �̷��� ���
		for(int i=0; i<persons.length; i++) {
			if(persons[i] instanceof Singer) {
				Singer ss = (Singer)persons[i];
				System.out.println(ss.getName()+ss.getAge()+ss.getAddress()
				+ss.getTitle()+ss.getYear()+ss.getGenre());
			} else if(persons[i] instanceof Employee) {
				Employee ee = (Employee)persons[i];
				System.out.println(ee.getName()+ee.getAge()+ee.getAddress()
				+ee.getDepartment()+ee.getJob()+ee.getSalary());
			} else if (persons[i] instanceof Person) { //�θ��� person�� ������ ��� ����� ���
				Person pp = persons[i];					//Person�ڷ����̿��� �� ���ԵǴϱ�
				System.out.println(pp.getName()+pp.getAge()+pp.getAddress());
				
			}
		}
		
		System.out.println("===�������ε��� �̿��� ���===");
		
		//���� �������ε� �̿��ؼ� ������ ����ϱ�
		//�������ε��� �̿��ϸ� �˾Ƽ� ������ �� �ִ� ��ü�� �������̵��Ǿ��ִ� �޼ҵ带 ȣ���ϰ� �Ǿ� 
		//����ȯ���� ������ �� �ִ� ��ü�� �޼ҵ带 �̿��� �� ����
		for(int i=0; i<persons.length; i++) {
			System.out.println(persons[i]);//object�� �ִ� toString�޼ҵ带 ȣ����
			//person(�θ�ü)�� ����ִ� ��ü�� �޼ҵ�(�������̵� ��)���� ���� ȣ����
		}
		
		System.out.println("====�������ε� �缳��====");
		Person person = new Person("�̼���",44,"�źϼ�");
		System.out.println(person.getName());
		
		person = new Employee("������",19,"��⵵ �����","�ڹ��к�","����",100);
		System.out.println(person.getName());
		//getName()�� Employee���� �������̵� �ߴ��� �� ������ �ٲ� ���
		
		//toString ->���������� ����� �� �Ű������� ������ 
		//������������ ������ ����ؾ��ϴµ� �ּҰ� �� ������ �ִ� �״�� �ּҸ� ����ϴ°� �ƴϰ�
		//���� ���� ����ϱ� ���� �ڵ����� toString()�޼ҵ带 ȣ���Ͽ� ���
		//��� ��ü�� �ݿ��Ǳ� ���� Object ��ü�� ����
		Date d = new Date();
		String str = new String("�ȳ�");
		System.out.println(str);
		System.out.println(d);
		
		Animal ani1 = new Animal();
		System.out.println(ani1.toString());//������ ���� ������ toString ����ȴ�~
		System.out.println(ani1);//toString() �� �Ŷ� ���� �� ����
		Object obj2 = ani1;
		System.out.println(obj2.toString());
		//�θ� �ڽ� ��ü �� ������ �� ����

		//��ü�� �����
		Person jo = new Person("����",28,"����");
		Person jo2 = new Person("����",28,"��õ");
		System.out.println(jo==jo2);
		//��ü�� ���� ��? equals�� ��� ex)String
		System.out.println(jo.equals(jo2));//���� ����. �ּҰ���
		//��ü�� ����� ���� ���� object�� �ִ� equals() �޼ҵ带 Override �Ͽ� ����Ѵ�.
		//�������� ���Ἲ�� ������ �ʵ��� ���� �����ϸ� ������ ��ü�� �νĵǰ� �ؾ���
		System.out.println(jo.equals("��������"));//java.lang.ClassCastException:
		//string�� person���� ��������ȯ �ȵ�
		
		//��ü ���� clone() Override�ϱ�
		Employee emp = new Employee("�����",30,"����","������","����",5);
		System.out.println(emp);
		Employee emp2 = emp.clone();
		System.out.println(emp2);
		
	}
}
