package com.nasuf.pattern.adapter.demo2;

/**
 * Created by nasuf on 2020/2/17.
 */
public class PrintBanner extends Print {

    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
