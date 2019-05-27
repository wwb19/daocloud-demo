package com.daocloud.demo.dcsdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/info")
    public String info(){
        return "DaoCloud Dcs Demo" ;
    }
}
