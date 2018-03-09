package com.hl.单例模式;

public class Singleton5 {
/*	懒汉式，登记式/静态内部类
	这种方式能达到双检锁方式一样的功效，但实现更简单。关键：可以延迟加载
	第三种(饿汉式)只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果）
	而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，
	只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。*/
	private static class SingletonHolder{
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	
	private Singleton5(){};
	
	public static final Singleton5 getInstance(){
		return SingletonHolder.INSTANCE;
	}
}
