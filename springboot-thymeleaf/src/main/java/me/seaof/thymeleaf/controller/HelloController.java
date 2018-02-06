package me.seaof.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/hello")     // 通过这里配置使下面的映射都在 /users
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)

    public String hello() {
        return "index";
    }
}