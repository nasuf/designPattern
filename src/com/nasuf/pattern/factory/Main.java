package com.nasuf.pattern.factory;

import com.nasuf.pattern.factory.framework.Factory;
import com.nasuf.pattern.factory.framework.Product;
import com.nasuf.pattern.factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("nasuf1");
        Product card2 = factory.create("nasuf2");
        Product card3 = factory.create("nasuf3");
        card1.use();
        card2.use();
        card3.use();
    }
}
