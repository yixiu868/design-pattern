package com.ww.template;

public class HouseHookOne extends HouseHookTemplate {
	
	public boolean buildToiletFlag;

	protected HouseHookOne(String name) {
		super(name);
	}
	
	public HouseHookOne(String name, boolean buildToiletFlag) {
		this(name);
		this.buildToiletFlag = buildToiletFlag;
	}

	@Override
	protected void buildDoor() {
		System.out.println(name +"的门要采用防盗门");
	}

	@Override
	protected void buildWindow() {
		System.out.println(name + "的窗户要面向北方");
	}

	@Override
	protected void buildWall() {
		System.out.println(name + "的墙使用大理石建造");
	}

	@Override
	protected void buildBase() {
		System.out.println(name + "的地基使用钢铁地基");
	}

	@Override
	protected void buildToilet() {
		System.out.println(name + "的厕所建在东南角");
	}

	@Override
	protected boolean buildToiletFlag() {
		return buildToiletFlag;
	}
}
