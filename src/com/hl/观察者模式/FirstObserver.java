package com.hl.观察者模式;

public class FirstObserver extends Observer{

	@Override
	public void finish(String message) {
		System.out.println("第一个观察者得知已完成，信息为" + message);
	}

}
