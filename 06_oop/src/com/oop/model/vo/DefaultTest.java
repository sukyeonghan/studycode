package com.oop.model.vo;

 class DefaultTest { 
	 //public 지움
	 //default 접근제한자 사용
	 //같은 패키지 내에서만 객체 활용이 가능함
	 
	 //같은 패키지에서 멤버변수 직접접근하기
	 {
		 FieldAccessTest fct = new FieldAccessTest();
		 
		 fct.publicInt = 200;
		 fct.protectedChar=0;
		 fct.defaultString="이건 될까?";
		 //fct.privateDouble=180.5; 같은 클래스에서만 가능!
				
		 
	 }
	 
}
