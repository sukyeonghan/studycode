package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator{
	
	@Override
	public int compare(Object o,Object o1) {
		//��ȯ�� ������ ����
		//���, 0, ������ -> 1,0,-1
		//return ����� �� �� ���� swap(��ü)
		//return ������ �� �� ���� �������� ����
		//return 0�̸� �� �� ���� �������� ����
		
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su = (Integer)o;
			Integer su2 = (Integer)o1;
//		
//			if(su>su2) return -1;
//			else if (su<su2) return 1;
//			else return 0;
				
			return su2-su; 
			//�������� �� �Ŵϱ� �ڿ� ���� Ŭ ���� �ٲٸ� �ȴ�.
		}
		
		return 0;
		
	}

}
