package com.nasuf.pattern.abstractfactory;

import com.nasuf.pattern.abstractfactory.factory.Factory;
import com.nasuf.pattern.abstractfactory.factory.Link;
import com.nasuf.pattern.abstractfactory.factory.Page;
import com.nasuf.pattern.abstractfactory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");
        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch  = factory.createTray("检索引擎");
        traysearch.add(google);
        traysearch.add(excite);
        traysearch.add(trayyahoo);

        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }

}
