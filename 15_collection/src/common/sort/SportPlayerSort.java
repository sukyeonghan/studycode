package common.sort;

import java.util.Comparator;

import com.collection.model.vo.Sports;

public class SportPlayerSort implements Comparator<Sports>{//<자료형/클래스명>
	//하나의 메소드로 오름차순,내림차순 가능하게
	private boolean flag;
	
	public SportPlayerSort(boolean flag) {//매개변수 있는 생성자.디폴트 생성자 없는 상태
		//true면 오름차순
		//false면 내림차순
		this.flag = flag;
	}
	//alt+s+v
	
	@Override
	public int compare(Sports o1, Sports o2) {
		
		return flag?o1.getPlayer()-o2.getPlayer():o2.getPlayer()-o1.getPlayer();//오름차순
	}
	
//	@Override
//	public int compare(Sports o1, Sports o2) {
//		
//		return o1.getPlayer()-o2.getPlayer();//오름차순
//	}

	
	
}
