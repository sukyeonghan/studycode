package emp.run;

import emp.model.vo.Employee;
import emp.model.vo.Products;

public class TestEmp {
	//실행용 클래스
	//class 범위 안에서 작용!
	public static void main(String[] args) {
		
	new Employee().printEmployee();
	new Products().printProduct();
	//class이름().print void 뒤 이름()
}

}
