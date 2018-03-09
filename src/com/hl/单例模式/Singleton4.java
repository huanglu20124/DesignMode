package com.hl.单例模式;

public class Singleton4 {
/*	懒汉式，Lazy初始化，双重校验锁，采用两个if判断
	安全且在多线程情况下能保持高性能。*/
	private static Singleton4 singleton;
	private Singleton4(){};
	public static Singleton4 getInstance(){
		//检查变量是否被初始化(不去获得锁)，如果已被初始化立即返回这个变量。
		if (singleton == null) {
			synchronized (Singleton4.class) {
				if(singleton == null){
					//第二次检查变量是否已经被初始化：如果其他线程曾获取过锁，那么变量已被初始化，返回初始化的变量。
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
