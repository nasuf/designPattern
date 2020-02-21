package com.nasuf.pattern.template;

/**
 * Created by nasuf on 2020/2/18.
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
