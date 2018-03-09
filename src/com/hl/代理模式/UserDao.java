package com.hl.代理模式;

public class UserDao implements IUserDao{
	/**
	 * 静态代理，被代理的类s
	 */
	@Override
	public void save() {
		System.out.println("已经保存数据");
	}
	
}
