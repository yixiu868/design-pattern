package com.ww.template;

/**
 * 模板模式基类,抽象基类包含公共模板方法,抽象方法子类实现
 * @author xiaohua
 *
 */
public abstract class HouseTemplate {

	protected String name;
	
	protected HouseTemplate(String name) {
		this.name = name;
	}
	
	protected abstract void buildDoor();
	
	protected abstract void buildWindow();
	
	protected abstract void buildWall();
	
	protected abstract void buildBase();
	
	/**
	 * 模板方法
	 */
	public final void buildHouse() {
		buildBase();
		buildWall();
		buildDoor();
		buildWindow();
	}
}
