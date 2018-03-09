package com.hl.适配器模式;

public class Adapter implements PS2{

	private USB usb;
	
	public Adapter(USB usb) {
		super();
		this.usb = usb;
	}


	@Override
	public void getPs2() {
		System.out.println("即将发生接口转换");
		usb.getUsb();
	}

}
