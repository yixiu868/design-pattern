package com.ww.template;

public class HouseTwo extends HouseTemplate {

	protected HouseTwo(String name) {
		super(name);
	}

	@Override
	protected void buildDoor() {
		System.out.println(name + "的门开建了");
	}

	@Override
	protected void buildWindow() {
		System.out.println(name + "的窗户开建了");
	}

	@Override
	protected void buildWall() {
		System.out.println(name + "的墙开建了");
	}

	@Override
	protected void buildBase() {
		System.out.println(name + "的地基开建了");
	}

}
