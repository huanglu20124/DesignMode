package com.hl.观察者模式;

public class SecondObserver extends Observer{

	@Override
	public void finish(String message) {
		System.out.println("第二个观察者得知已完成，信息为" + message);
	}

}
