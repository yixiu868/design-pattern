package com.ww.template;

public class TestHook {

	public static void main(String[] args) {
		HouseHookTemplate houseOne = new HouseHookOne("李雷");
		HouseHookTemplate houseOne2 = new HouseHookOne("Jim", false);
		HouseHookTemplate houseTwo = new HouseHookTwo("韩梅梅");
		
		houseOne.buildHouse();
		System.out.println("=============");
		houseOne2.buildHouse();
		System.out.println("=============");
		houseTwo.buildHouse();
	}
}
