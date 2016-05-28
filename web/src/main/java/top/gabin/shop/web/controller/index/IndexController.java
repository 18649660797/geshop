/**
 * Copyright (c) 2016 云智盛世
 * Created with IndexController.
 */
package top.gabin.shop.web.controller.index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author linjiabin on  16/5/5
 */
@Controller
@RequestMapping("/")
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @RequestMapping(value = {"", "/", "/index"})
    public ModelAndView indexView() {
        ModelAndView modelAndView = new ModelAndView("index");
        logger.info("this is index");
        return modelAndView;
    }
}
