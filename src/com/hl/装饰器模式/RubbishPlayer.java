package com.hl.装饰器模式;

public class RubbishPlayer implements Player{

	@Override
	public void play() {
		System.out.println("业余球员打球");
	}

}
