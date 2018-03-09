package com.hl.代理模式;


public class Test {
	/**
	 * 静态代理测试
	 */
	public static void test1(){
		//目标对象
		IUserDao target = new UserDao();
		//放入代理对象中
		UserDaoProxy proxy = new UserDaoProxy(target);
		//通过代理对象执行对应方法
		proxy.save();
	}
	
	public static void main(String[] args) {
		test1();
	}
}
