## 1. 代理模式
- 为其他对象提供一种代理以控制对这个对象的访问。
- **和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。**
- **和装饰器模式的区别：装饰器模式为了增强功能，而代理模式是为了加以控制。**

代理模式分为静态代理，动态代理以及Cglib代理三种
### 1. 静态代理
- 静态代理在使用时,需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类，然后代理对象中包含有被代理对象（作为成员变量），然后通过代理对象执行被代理对象的方法。
- 缺点：因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护。

### 2. 动态代理
- 利用JDK的Proxy类,动态的在内存中构建代理对象(需要我们指定创建代理对象/目标对象实现的接口的类型)

### 3. Cglib代理
- 上面的静态代理和动态代理模式都是要求目标对象是实现一个接口的目标对象,但是有时候目标对象只是一个单独的对象,**并没有实现任何的接口**,这个时候就可以使用**以目标对象子类的方式类实现代理**,这种方法就叫做:Cglib代理。
- Cglib是一个强大的高性能的代码生成包,它可以在运行期扩展java类与实现java接口。
- 广泛的被许多AOP的框架使用,例如Spring AOP和synaop,为他们提供方法的interception(拦截)。
- .需要引入cglib的jar文件,但是Spring的核心包中已经包括了Cglib功能。

----------

## 2. 策略模式
- 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
- 关键代码：实现同一个接口。
- 如果在一个系统里面有许多类，它们之间的区别仅在于它们的行为，那么使用策略模式可以动态地让一个对象在许多行为中选择一种行为。行为都实现同一个接口，对象可以动态的设置使用哪一种行为。

----------

## 3. 单例模式
单例对象能保证在一个JVM中，该对象只有一个实例存在。不用频繁创建，节省系统开销。
### 1. 懒汉式（非线程安全）
- 懒汉式，线程不安全,不支持多线程。因为没有加锁 synchronized。
### 2. 懒汉式（线程安全）
- 懒汉式，线程安全，必须加锁 synchronized 才能保证单例。
-  但加锁会影响效率。效率很低，99% 情况下不需要同步。
### 3. 懒汉式（双重校验锁）
- 懒汉式，Lazy初始化，双重校验锁，采用两个if判断。
- 安全且在多线程情况下能保持高性能。
### 4. 懒汉式（静态内部类）
- 这种方式能达到双检锁方式一样的功效，但实现更简单。
- 关键：可以延迟加载。
- 饿汉式中，只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果）。而这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。

### 5. 饿汉式
- 饿汉式加载(非Lazy初始化)
- 优点：没有加锁，执行效率会提高。
- 缺点：类加载时就初始化，浪费内存。

### 6. 饿汉式（枚举类型）
- 这种方式是 Effective Java 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
- 原理：enum是通过继承了Enum类实现的，Enum类是final的；enum仅有私有构造器，防止外部的额外构造；JVM禁止实现枚举类型的readObject等方法。

----------

## 4. 工厂模式
- 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
- 可以通过反射实现，根据传入的对象类的类型创建相应对象。

----------

## 5. 抽象工厂模式
- 让工厂类继承一个接口，增加新功能的时候创建新的工厂类。

----------


## 6. 建造者模式

- 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象。
- 一个 Builder 类会一步一步构造最终的对象。
- 注意事项：与工厂模式的区别是：建造者模式更加关注零件装配的顺序。
- 一般实现，需要被建造的对象内部有个静态内部类xxBuilder，通过外部创建Builder对象，调用Builder对象的方法，一步步添加属性，最后build（）方法返回一个对象。

----------

## 7. 装饰器模式
- 何时使用：在不想增加很多子类的情况下扩展类。（实现方法和代理模式有很多重复的）
- 装饰器通过包装一个装饰对象来扩展其功能，而又不改变其接口，这实际上是基于对象的适配器模式的一种变种。（适配器模式需要实现另外一个接口，而装饰器模式必须实现该对象的接口。）
- 实例流程：通过继承和目标对象一样接口、创建一个抽象类xxDecorator，该Decorator抽象类包含了一个目标对象，接着和代理模式差不多，再继承该xxDecorator实现具体的装饰器，装饰器中对目标对象的方法进行增强。

----------


## 8. 适配器模式
- 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
- 经常的用法，创建一个Adapter类，Adapter分别实现或者继承A类或者B类的方法，通过A类的方法中调用B类的方法，或者B类的方法中调用A类的方法，来使得不匹配的两个接口，能够使用另外一个接口的方法，这就是匹配的含义。


----------


## 9. 观察者模式
- 观察者订阅被观察者的状态，当被观察者状态改变的时候会通知所有订阅的观察者的过程。
- 用法：将被观察者传入到观察者中，然后观察者调用被观察者对象的方法进行通知。
- 和异步操作中的回调很相似，最后都是通过被等待对象调用等待对象的方法来通知。

----------

