package common.sort;

import java.util.Comparator;

public class StringSort implements Comparator<String>{//제네릭
	//Comparator가 추상메소드 가지고 있으므로 여기서 구현해야함

	@Override
	public int compare(String o1, String o2) {
		//String 대소비교 안됨
		//String의 순서를 비교하는 메소드를 구현해놓음
		return o2.compareTo(o1);
	}



	
	
}
