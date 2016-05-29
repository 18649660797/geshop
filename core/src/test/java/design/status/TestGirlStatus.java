/**
 * Copyright (c) 2016 云智盛世
 * Created with TestGirlStatus.
 */
package design.status;

import org.junit.Test;
import top.gabin.design.status.GirlFriend;

/**
 * 测试女朋友的行为
 *
 * @author linjiabin on  16/5/15
 */
public class TestGirlStatus {

    @Test
    public void testGirl() {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.lossMoney();
        girlFriend.shopping();
        girlFriend.lossMoney();
        girlFriend.lossMoney();
        girlFriend.watchMovie();
        girlFriend.eat();
    }

}
