package com.override.main;

import com.override.model.vo.SupersonicAirplane;

public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
