package com.hl.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test2 {
	/**
	 * 动态代理测试
	 * @param args
	 */
	public static void main(String[] args) {
		IUserDao target = new UserDao();
		IUserDao userDao = (IUserDao) Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						 System.out.println("开始事务");
	                        //执行目标对象方法
	                     Object returnValue = method.invoke(target, args);
	                     System.out.println("提交事务");
	                     return returnValue;
					}
				});
		userDao.save();
	}
}
