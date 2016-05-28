/**
 * Copyright (c) 2016 云智盛世
 * Created with LoginController.
 */
package top.gabin.shop.admin.web.controller.authorized;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author linjiabin on  16/5/4
 */
@Controller
@RequestMapping("/")
public class LoginController {
    private final static String dir = "authorized";
    @RequestMapping("login")
    public String loginView() {
        return dir + "/login";
    }
}
