package com.hl.策略模式;

public class Test {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(1, 2));
		context.setStrategy(new OperationSubstract());
		System.out.println(context.executeStrategy(1, 2));
	}
}
