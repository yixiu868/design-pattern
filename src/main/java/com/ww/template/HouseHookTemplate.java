package com.ww.template;

public abstract class HouseHookTemplate {

	protected String name;
	
	protected HouseHookTemplate(String name) {
		this.name = name;
	}
	
	protected abstract void buildDoor();
	
	protected abstract void buildWindow();
	
	protected abstract void buildWall();
	
	protected abstract void buildBase();
	
	protected abstract void buildToilet();
	
	// 钩子方法
	protected boolean buildToiletFlag() {
		return true;
	}
	
	// 公共模板
	public final void buildHouse() {
		buildBase();
		buildWall();
		buildDoor();
		buildWindow();
		
		if (buildToiletFlag()) {
			buildToilet();
		}
	}
}
