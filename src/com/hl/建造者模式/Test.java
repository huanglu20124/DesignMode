package com.hl.建造者模式;

public class Test {
	public static void main(String[] args) {
		Person.Builder builder = new Person.Builder("黄路", 170);
		builder.setSchool("中山大学");
		builder.setDepartment("xxx");
		Person person = builder.build();
		person.print();
	}
}
