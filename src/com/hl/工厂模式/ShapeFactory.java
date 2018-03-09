package com.hl.工厂模式;

public class ShapeFactory {
	public static Object getClass(Class<? extends Shape> clazz){
		Object object = null;
		try {
			object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
