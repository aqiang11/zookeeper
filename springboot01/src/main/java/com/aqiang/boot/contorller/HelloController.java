package com.aqiang.boot.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenovo
 */


@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        return "hello Spring boot";
    }


}
