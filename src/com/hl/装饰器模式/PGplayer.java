package com.hl.装饰器模式;

public class PGplayer extends PlayerDecorator{

	public PGplayer(Player player) {
		this.player = player;
	}
	
	@Override
	public void play() {
		System.out.println("继承自装饰器，原类得到加强，成为后卫");
		player.play();
	}

}
