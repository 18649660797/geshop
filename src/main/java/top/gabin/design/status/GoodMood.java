/**
 * Copyright (c) 2016 云智盛世
 * Created with GoodMood.
 */
package top.gabin.design.status;

/**
 * 好心情
 *
 * @author linjiabin on  16/5/15
 */
public class GoodMood implements BehaviorMood {
    private GirlFriend girlFriend;

    public GoodMood(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }

    public void lossMoney() {
        System.out.println("心情有点不开心,还不算太差");
        girlFriend.setCurrentMood(girlFriend.getNormalMood());
    }

    public void eat() {
        System.out.println("心情不错");
    }

    public void watchMovie() {
        System.out.println("心情很不错");
    }

    public void shopping() {
        System.out.println("心情极好,但也不能更好了");
    }
}
