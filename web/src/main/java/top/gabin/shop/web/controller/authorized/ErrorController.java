/**
 * Copyright (c) 2016 云智盛世
 * Created with ErrorController.
 */
package top.gabin.shop.web.controller.authorized;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class description
 *
 * @author linjiabin on  16/5/17
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping("")
    public String viewError() {
        return "exception/403";
    }
}
