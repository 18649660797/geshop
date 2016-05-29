/**
 * Copyright (c) 2016 云智盛世
 * Created with CustomerController.
 */
package top.gabin.shop.admin.web.controller.index;

import gabin.core.entity.Customer;
import gabin.core.jpa.criteria.query.dto.PageDTO;
import gabin.core.jpa.criteria.query.service.CriteriaQueryService;
import gabin.core.jpa.criteria.query.uil.CriteriaQueryUtils;
import gabin.core.utils.http.RenderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Class description
 *
 * @author linjiabin on  16/5/29
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Resource(name = "criteriaQueryService")
    private CriteriaQueryService queryService;

    @RequestMapping("/data")
    @ResponseBody
    public Map data(HttpServletRequest request) {
        PageDTO<Customer> pageDTO = queryService.queryPage(Customer.class, CriteriaQueryUtils.parseCondition(request));
        return RenderUtils.filterPageDataResult(pageDTO, "id,userName,password,total,realName,sourceCustomer.userName,tel,email");
    }
}
