package com.hl.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	//被观察者
	private List<Observer>observers = new ArrayList<>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//通知所有观察者
	public void notifyAll(String message){
		for(Observer observer : observers){
			observer.finish("任务已完成");
		}
	}
	
}
