package com.hl.代理模式;

public class UserDaoProxy implements IUserDao{
	/**
	 * 静态代理，代理对象
	 */
	private IUserDao target;
	
	
	
	public UserDaoProxy(IUserDao target) {
		super();
		this.target = target;
	}

	public IUserDao getTarget() {
		return target;
	}

	public void setTarget(IUserDao target) {
		this.target = target;
	}

	@Override
	public void save() {
		System.out.println("开始事务....");
		target.save();
		System.out.println("提交事务....");
	}

}
