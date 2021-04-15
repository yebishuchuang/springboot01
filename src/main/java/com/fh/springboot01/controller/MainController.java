package com.fh.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fh
 * @create 2021-03-21 下午9:16
 */
@Controller
@RequestMapping("/user")
public class MainController {

    @RequestMapping("/list")
    public  String getList(){
        System.out.println("mainController中的getList()方法执行了");
        return "list";
    }

    /**
     * 新增一个test方法用来测试相github中提交代码
     * @return
     */
    public  String test(){
        return null;
    }
}
