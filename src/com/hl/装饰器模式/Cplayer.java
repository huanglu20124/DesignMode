package com.hl.装饰器模式;

public class Cplayer extends PlayerDecorator{

	public Cplayer(Player player) {
		this.player = player;
	}
	
	@Override
	public void play() {
		System.out.println("继承自装饰器，原类得到加强，成为中锋");
		player.play();
	}

}
