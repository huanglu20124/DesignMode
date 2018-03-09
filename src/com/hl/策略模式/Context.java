package com.hl.策略模式;

public class Context {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}
	
	public Context(Strategy strategy) {
		System.out.println("重新设置策略为" + strategy.getClass().getSimpleName());
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		System.out.println("重新设置策略为" + strategy.getClass().getSimpleName());
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2){
		System.out.println("执行策略");
		return strategy.doOperation(num1, num2);
	}
}
