/**
 * Copyright (c) 2016 云智盛世
 * Created with TestObserver.
 */
package design.observer;

import org.junit.Test;
import top.gabin.design.observer.JingdongObserver;
import top.gabin.design.observer.Kuaidi100Subject;
import top.gabin.design.observer.TaobaoObserver;

/**
 * 测试类
 * @author linjiabin on  16/4/29
 */
public class TestObserver {

    @Test
    public void testObserver() {
        Kuaidi100Subject subject = new Kuaidi100Subject();
        TaobaoObserver taobaoObserver = new TaobaoObserver();
        subject.addObserver(taobaoObserver);
        subject.addObserver(new JingdongObserver());
        subject.setChanged();
        subject.notifyObservers("你的货已经到了");
    }

}
