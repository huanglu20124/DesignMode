package com.hl.观察者模式;

public class Test {
	public static void main(String[] args) {
		FirstObserver observer = new FirstObserver();
		SecondObserver observer2 = new SecondObserver();
		Subject subject = new Subject();
		subject.attach(observer);
		subject.attach(observer2);
		//耗时操作。。。
		subject.notifyAll("被观察者的任务完成了！");
	}
}
