package com.nasuf.pattern.singleton;

import sun.jvm.hotspot.oops.Instance;

public class Test01 {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);   // true
        System.out.println(singleton1.hashCode());  // 621009875
        System.out.println(singleton2.hashCode());  // 621009875
    }
}

/**
 * 饿汉式一
 * <p>
 * 优点：简单，在类加载时完成实例化，避免了线程同步问题
 * 缺点：在类加载时完成实例化，没有达到懒加载效果，如果从未使用过这个实例，则会造成内存浪费
 */
class Singleton1 {
    private Singleton1() {
    }

    private final static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}

/**
 * 饿汉式二
 * <p>
 * 优点：简单，在类加载时完成实例化，避免了线程同步问题
 * 缺点：在类加载时完成实例化，没有达到懒加载效果，如果从未使用过这个实例，则会造成内存浪费
 */
class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}

/**
 * 懒汉式一
 * <p>
 * 优点：懒加载效果
 * 缺点：线程不安全，只能应用在单线程情况下
 */
class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

/**
 * 懒汉式二
 * 优点：懒加载效果，线程安全
 * 缺点：效率低，每个线程在想获得类的实例时，执行getInstance方法都要进行同步
 */
class Singleton4 {
    private Singleton4() {
    }

    private static Singleton4 instance;

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}

/**
 * 懒汉式三
 * 缺点：线程不安全，效率低，每个线程在想获得类的实例时，执行getInstance方法都要进行同步
 */
class Singleton5 {
    private Singleton5() {
    }

    private static Singleton5 instance;

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}

/**
 * 双重检查, 推荐使用
 */
class Singleton6 {
    private Singleton6() {
    }

    private static volatile Singleton6 instance;

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
