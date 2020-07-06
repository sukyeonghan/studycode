package com.api.controller;

import java.util.StringTokenizer;

public class StringTest {
	
	public static void main(String[] args) {
		//String ��ü �̿��غ���~
		//String�� String�� �ִ� ���� ����, ����, ������ �Ұ�����.
		String name ="������";
		//hashcode() -> �ּҰ��� �ǹ���
		System.out.println(name+" : "+name.hashCode());
		
		name+="õ��";
		System.out.println(name+" :"+name.hashCode());
		//�ּҰ��� �ٲ�. 
		//�ι�° ���ڸ� ���� �ٲٱ�? �Ұ���
		
		//String ��ü���� �����ϰ� ����ϴ� �޼ҵ�!
		//���ڿ��� �ִ� ���� ã�� : contains();
		String test="�����ٶ󸶹ٻ������ī";
		//���� �̷��� ��
//		for(int i=0; i<test.length(); i++) {
//			if(test.charAt(i).equals())
//		}
		
		System.out.println(test.contains("��"));
		System.out.println(test.contains("��"));
		
		test="����ȣ ȭ����! ���� ������ �ϼ��� ��Ʈ���̶� �׸��ο��!";
		System.out.println(test.contains("����"));
		System.out.println(test.contains("Ȳ��ȣ"));
	
		//Ư�� ������ ��ġ�� ã���ִ� �޼ҵ� : indexOf();
		//ã�� ������ �ε����� ��ȯ����. �� ã���� -1�� ��ȯ��
		System.out.println(test.indexOf("��"));
		System.out.println(test.indexOf("��Ʈ��"));
		System.out.println(test.indexOf("Ȳ��ȣ"));
		System.out.println(test.indexOf(" ")); //���� ���� �߰ߵ� �� ����ϰ� ��
		
		//�ߺ����� ���� �� �� ��° �� ã��
		System.out.println(test.indexOf(" ",test.indexOf(" ")+1));//2��° ���� ã��
		System.out.println(test.indexOf(" ",test.indexOf(" ",test.indexOf(" ")+1)));
		
		//lastIndexOf() : �ڿ������� �����ؼ� ã��. �ε��� ���ڴ� �տ������� 0,1..
		test="ttt.file.txt";
		System.out.println(test.lastIndexOf("."));
	
		//���ڿ��� �������ִ� �޼ҵ� : replace(); ���� ��
		//replace(�����󹮱�, ���ο� ����)
		System.out.println(test.replace("txt", "hwp"));//�������� ������� ����
		String test2 = test.replace("txt", "jpg");
		System.out.println(test2);
		System.out.println(test);
	
		//���ڿ� ������ �������ִ� �޼ҵ� : trim();
		//������ �����͸� �Ѱ��� �� �ڵ����� ������ ���� �� ����
		//�׷��� false�� �� ���� �ִ�! ���� ���� ���ϸ� ����� �� ����
		test="   ��   ��      "; //���� ��,�ڴ� ���������� ���ڿ� ���� ���̴� trim���� ��������
		test2="����";
		System.out.println(test);
		System.out.println(test.trim().replace(" ",""));//���� ���� ���� ����
		System.out.println(test.trim().equals(test2));
		
		//���� ��ҹ��� �ڵ����� �ٲ� toUpperCase();, toLowerCase();
		
		//���ڿ��� ���ϴ� ��ŭ �߶󳻴� �޼ҵ� : subString(�����ε���,���ε���+1);
		test="�Ļ�ð� ����ð� ����޴� ���Ÿ��!";
		System.out.println(test.substring(0,4));
		//subString(�ε���); ���۸� ������ ��. ���ۺ��� ������ �� ����
		System.out.println(test.substring(9));
		
		// substring() indexOf() �����Ͽ� ���
		System.out.println(test.substring(test.indexOf("����޴�"),test.indexOf("��")+1));
		//���Ͽ� ���� Ȯ���ڸ� ©�󳻱�
		test="test.txt";
		System.out.println(test.substring(test.lastIndexOf(".")+1));
	
		//���ڿ��� Ư�������ڷ� ������ �� ������ �� �����ڸ� ��������
		//�迭�� ������ִ� �޼ҵ� : split(������);  ������.���� ��~
		test="������,����,����ȣ,������,�����,������";
		String[] names = test.split(",");
		System.out.println(names[3]); //������
		
		//���ڿ�-> ���ڿ��迭 : split();
		//���ڿ��迭 -> ���ڿ� : join(); �̰͵� �� ���� ����
		for(String v : names) {
			System.out.println(v);
		}
		
		String returnStr = String.join("^.~*",names);
		System.out.println(returnStr);
		
		
		
		//StringBuffer : ���ڿ� �����ϴ� ��ü
		//����� ���ڿ��� �����ϴ� ���� ������. Ư�� ���� ����, Ư�� ��ġ ���� ���
		//��ü -> ����, ����, ���� �޼ҵ带 ���ؼ� �̷����
		StringBuffer sb = new StringBuffer("������");
		//StringBuffer�� ����Ϸ���
		System.out.println(sb+" : "+sb.hashCode()); //toString �������̵��� �Ǿ��ִ�.������ �����ϱ�
		//StringBuffer �� ����
		//���ڿ� �߰��ϱ�(�ڿ� �߰��� ����)
		sb.append("������"); //�������� ������. String += �� ����
		System.out.println(sb+" : "+sb.hashCode()); //������ �ּҰ� ����
		
		//�������� Ư�� ��ġ�� ���� ���� ���� ����
		//insert(��ġ,���� ����)�޼ҵ� �̿�
		sb.insert(3,"�ƺ���");
		System.out.println(sb);
		
		//Ư�� ��ġ�� ���ڿ��� ������ �� ����
		//delete();
		sb.delete(1,3);
		System.out.println(sb);
		
		//Ư�� ��ġ�� ���ڸ� ����
		//replace(�����ε���, ���ε���, �߰��� ����);
		sb.replace(3, 6, "õ��");
		System.out.println(sb);
		
		//string�̶� ���� ȣȯ��
		String str = new String(sb);
		System.out.println(str);
		sb = new StringBuffer(str);
	
	
	
		//StringBuilder
		//������ ������ �������. �帧�� ���ε���. �����͸� ���������� ����
		//�����尡 ������ ������.(������ safe)�������� �� ��������
		//�̰� ������ safe�� �������� �ʾƼ� �ӵ��� �� ����
		
		StringBuilder sbu = new StringBuilder("������");
		sb.append("������");
		System.out.println(sbu); //�ٸ� ��� �� �Ȱ���
		
		//��ū �޼ҵ� ȣ��
		stringTokenTest();
		
	}
	
	public static void stringTokenTest() {
		//stringTokenizerŬ���� �̿��ϱ�
		//���ڿ��� Ư�������ڷ� �и��س��� ��ü (������ ����, Ư��������)
		//Ʈ���̸� �ϳ� ����� ĭ���� 
		String str = "java,oracle_c_c++,html,css,javascript,jquery,spring";
		//String[] lang = str.split(",");
		StringTokenizer st = new StringTokenizer(str,",_");//_�߰�
		//��ū�� �ϳ��� Ȯ��hasMoreTokens()�ϰ� ����ϰ� ����nextToken()
		//������ false
		while(st.hasMoreTokens()) {
			
		//	System.out.println(st.nextToken());
			//System.out.println(st.nextToken());
			//2������ 2���� ����-7���ϱ� 1�� �� ������
			//��� �� �ٽ� ������ �����ؾ� ��
			
			String temp = st.nextToken();
			if(temp.contains("c")) {
				System.out.println(temp);
			}
			
//			if(st.nextToken().contains("c")) {
//				System.out.println(st.nextToken());
//			} //�̰� �߸��� ��! 2�� ���� ���µ� �ϳ��� �������ϱ� oracle�� c�־ �� ���� ���� ��µ�
		}
		
	}
	
}
