/**
 * Copyright (c) 2016 云智盛世
 * Created with Screen.
 */
package gabin.design.factory.normal;

/**
 * 屏幕
 * @author linjiabin on  16/4/30
 */
public class Screen implements Component {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void assembly(Phone phone) {
        phone.setScreen(this);
    }
}
