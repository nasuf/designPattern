package com.nasuf.pattern.adapter.demo2;

/**
 * Created by nasuf on 2020/2/17.
 * 对象适配器模式
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeek();
    }

}
