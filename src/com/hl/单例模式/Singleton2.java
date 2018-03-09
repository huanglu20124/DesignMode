package com.hl.单例模式;

public class Singleton2 {
/*	懒汉式，Lazy 初始化,线程安全，必须加锁 synchronized 才能保证单例，但加锁会影响效率。效率很低，99% 情况下不需要同步。
	优点：第一次调用才初始化，避免内存浪费。*/
	private static Singleton2 singleton;
	private Singleton2() {}
	public static synchronized Singleton2 getInstance(){
		if(singleton == null) singleton = new Singleton2();
		return singleton;
	}	
}
