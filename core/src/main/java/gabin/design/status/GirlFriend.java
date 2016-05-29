/**
 * Copyright (c) 2016 云智盛世
 * Created with GirlFriend.
 */
package gabin.design.status;

/**
 * 女朋友
 * @author linjiabin on  16/5/15
 */
public class GirlFriend implements Behavior {
    private NormalMood normalMood;
    private BadMood badMood;
    private GoodMood goodMood;

    public void setCurrentMood(BehaviorMood currentMood) {
        this.currentMood = currentMood;
    }

    public NormalMood getNormalMood() {
        return normalMood;
    }

    public BadMood getBadMood() {
        return badMood;
    }

    public GoodMood getGoodMood() {
        return goodMood;
    }

    public BehaviorMood getCurrentMood() {
        return currentMood;
    }

    private BehaviorMood currentMood;

    public GirlFriend() {
        currentMood = normalMood = new NormalMood(this);
        badMood = new BadMood(this);
        goodMood = new GoodMood(this);
    }

    public void lossMoney() {
        currentMood.lossMoney();
    }

    public void eat() {
        currentMood.eat();
    }

    public void watchMovie() {
        currentMood.watchMovie();
    }

    public void shopping() {
        currentMood.shopping();
    }

}
