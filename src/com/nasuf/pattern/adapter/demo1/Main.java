package com.nasuf.pattern.adapter.demo1;

/**
 * Created by nasuf on 2020/2/17.
 * 类适配器模式
 */
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeek();
    }

}
