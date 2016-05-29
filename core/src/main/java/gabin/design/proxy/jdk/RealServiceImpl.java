/**
 * Copyright (c) 2016 云智盛世
 * Created with RealServiceImpl.
 */
package gabin.design.proxy.jdk;

import java.util.Date;

/**
 * Class description
 *
 * @author linjiabin on  16/5/15
 */
public class RealServiceImpl implements RealService {
    public void now() {
        System.out.println(new Date());
    }
}
