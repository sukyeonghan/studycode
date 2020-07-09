package common.sort;

import java.util.Comparator;

import com.collection.model.vo.Sports;

public class SportPlayerSort implements Comparator<Sports>{//<�ڷ���/Ŭ������>
	//�ϳ��� �޼ҵ�� ��������,�������� �����ϰ�
	private boolean flag;
	
	public SportPlayerSort(boolean flag) {//�Ű����� �ִ� ������.����Ʈ ������ ���� ����
		//true�� ��������
		//false�� ��������
		this.flag = flag;
	}
	//alt+s+v
	
	@Override
	public int compare(Sports o1, Sports o2) {
		
		return flag?o1.getPlayer()-o2.getPlayer():o2.getPlayer()-o1.getPlayer();//��������
	}
	
//	@Override
//	public int compare(Sports o1, Sports o2) {
//		
//		return o1.getPlayer()-o2.getPlayer();//��������
//	}

	
	
}
