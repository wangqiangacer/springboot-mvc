package cn.jacken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 返回跳转的页面
 */
@Controller
public class UserController {
    @RequestMapping("/pageIndex")
    public  String pageIndex(){
        return "pageIndex";

    }
}
