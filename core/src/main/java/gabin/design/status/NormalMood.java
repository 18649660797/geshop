/**
 * Copyright (c) 2016 云智盛世
 * Created with NormalMood.
 */
package gabin.design.status;

/**
 * 普通心情
 *
 * @author linjiabin on  16/5/15
 */
public class NormalMood implements BehaviorMood {

    private GirlFriend girlFriend;

    public NormalMood(GirlFriend girlFriend) {
        this.girlFriend = girlFriend;
    }

    public void lossMoney() {
        System.out.println("我不开心了");
        girlFriend.setCurrentMood(girlFriend.getBadMood());
    }

    public void eat() {
        System.out.println("我开心了");
        girlFriend.setCurrentMood(girlFriend.getGoodMood());
    }

    public void watchMovie() {
        System.out.println("我开心了");
        girlFriend.setCurrentMood(girlFriend.getGoodMood());
    }

    public void shopping() {
        System.out.println("我开心了");
        girlFriend.setCurrentMood(girlFriend.getGoodMood());
    }

}
