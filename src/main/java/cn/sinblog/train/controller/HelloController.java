package cn.sinblog.train.controller;

import cn.sinblog.train.service.HelloService;
import cn.sinblog.train.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getTime")
    public HelloService hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new HelloService(name);
    }
}
