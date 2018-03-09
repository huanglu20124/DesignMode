package com.hl.单例模式;

public enum Singleton6 {
/*	饿汉式，枚举类型
	这种方式是 Effective Java 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
	原理：enum是通过继承了Enum类实现的，Enum类是final的；enum仅有私有构造器，防止外部的额外构造；JVM禁止实现枚举类型的readObject等方法。*/
	INSTANCE;
    public void otherMethods(){
        System.out.println("Something");
    }
}
