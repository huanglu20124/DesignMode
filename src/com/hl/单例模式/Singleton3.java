package com.hl.单例模式;

public class Singleton3 {
/*	饿汉式加载(非Lazy初始化)
	优点：没有加锁，执行效率会提高。
	缺点：类加载时就初始化，浪费内存。*/
	private static Singleton3 singleton = new Singleton3();
	private Singleton3(){};
	public static Singleton3 getInstance(){
		return singleton;
	}
}
