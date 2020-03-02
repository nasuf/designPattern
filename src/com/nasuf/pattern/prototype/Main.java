package com.nasuf.pattern.prototype;

import com.nasuf.pattern.prototype.framework.Manager;
import com.nasuf.pattern.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.regiser("strong message", upen);
        manager.regiser("warning box", mbox);
        manager.regiser("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello, World.");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World.");
    }
}
