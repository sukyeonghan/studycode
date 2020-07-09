package common.sort;

import java.util.Comparator;

public class NumberSort implements Comparator{
	
	@Override
	public int compare(Object o,Object o1) {
		//반환값 정해져 있음
		//양수, 0, 음수로 -> 1,0,-1
		//return 양수면 두 개 값을 swap(교체)
		//return 음수면 두 개 값을 변경하지 않음
		//return 0이면 두 개 값을 변경하지 않음
		
		if(o instanceof Integer && o1 instanceof Integer) {
			Integer su = (Integer)o;
			Integer su2 = (Integer)o1;
//		
//			if(su>su2) return -1;
//			else if (su<su2) return 1;
//			else return 0;
				
			return su2-su; 
			//내림차순 할 거니까 뒤에 값이 클 때만 바꾸면 된다.
		}
		
		return 0;
		
	}

}
