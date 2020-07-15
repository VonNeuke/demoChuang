package com.example.demo.controller;

import com.example.demo.config.DemoConfig;
import com.example.demo.domain.DemoParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoConfig demoConfig;

    @PostMapping("/helloWorld")
    public DemoParam helloWorld(@RequestBody DemoParam param){
        // check param
        // business
        // return
        return null;
    }

    @GetMapping ("/helloWorld")
    public String getHelloWorld(){
        System.out.println(demoConfig.getIp());
        System.out.println(demoConfig.getPort());
        return "hello word";
    }

}
