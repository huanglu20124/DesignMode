package com.hl.单例模式;

public class Singleton1 {
/*	懒汉式，Lazy 初始化,线程不安全,不支持多线程。因为没有加锁 synchronized*/
	private static Singleton1 singleton;
	private Singleton1() {}
	public static Singleton1 getInstance(){
		if(singleton == null) singleton = new Singleton1();
		return singleton;
	}
	
	
}
