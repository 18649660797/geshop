/**
 * Copyright (c) 2016 云智盛世
 * Created with ExceptionController.
 */
package top.gabin.shop.web.controller.authorized;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class description
 *
 * @author linjiabin on  16/5/7
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {
    private String dir = "exception";
    @RequestMapping("/403")
    public String view403() {
        return dir + "/403";
    }
}
