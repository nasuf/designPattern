package com.nasuf.pattern.adapter.demo1;

/**
 * Created by nasuf on 2020/2/17.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
