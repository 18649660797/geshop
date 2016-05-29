/**
 * Copyright (c) 2016 云智盛世
 * Created with BadMood.
 */
package gabin.design.status;

/**
 * 坏心情
 *
 * @author linjiabin on  16/5/15
 */
public class BadMood implements BehaviorMood {
    private GirlFriend girlFriend;

    public BadMood(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }

    public void lossMoney() {
        System.out.println("我心情非常糟糕,但是也没办法");
    }

    public void eat() {
        System.out.println("我心情好一点了");
        girlFriend.setCurrentMood(girlFriend.getNormalMood());
    }

    public void watchMovie() {
        System.out.println("我心情好一点了");
        girlFriend.setCurrentMood(girlFriend.getNormalMood());
    }

    public void shopping() {
        System.out.println("我心情好很多了");
        girlFriend.setCurrentMood(girlFriend.getGoodMood());
    }
}
