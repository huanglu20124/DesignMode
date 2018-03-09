package com.hl.适配器模式;

public class Test {
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new USB());
		//将PS2接口转换为USB接口
		adapter.getPs2();
	}
}
