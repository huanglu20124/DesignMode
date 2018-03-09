package com.hl.建造者模式;

public class Person {
	/**
	 * 建造者模式，参考effective java
	 */
	//以下的属性为默认属性,全是final类型
	private final String name;
	private final int height;
	private final String school;
	private final String department;
	
	public static class Builder{
		//必选属性
		private final String name;
		private final int height;
		//可选属性
		private String school = "默认学校";
		private String department = "默认院系";
		
		public Builder(String name, int height) {
			super();
			this.name = name;
			this.height = height;
		}
		
		public Builder setSchool(String school){
			this.school = school;
			return this;
		}
		
		public Builder setDepartment(String department){
			this.department = department;
			return this;
		}
		
		public Person build(){
			return new Person(this);
		}
	}
	
	
	//私有的构造方法，内部通过builder构造对象
	private Person(Builder builder){
		name = builder.name;
		school = builder.school;
		height = builder.height;
		department = builder.department;
	}
	
	public void print(){
		System.out.println(name);
		System.out.println(height);
		System.out.println(school);
		System.out.println(department);
	}
}
