package com.hl.装饰器模式;

public class Test {
	public static void main(String[] args) {
		Player target = new ProfessinalPlayer();
		Cplayer cplayer= new Cplayer(target);
		cplayer.play();
		PGplayer pGplayer = new PGplayer(target);
		pGplayer.play();
	}
}
