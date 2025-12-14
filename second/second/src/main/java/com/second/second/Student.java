package com.second.second;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Student {

    @RequestMapping("/name")
    @ResponseBody
    public String name()
    {
        return "Hello";
    }

    @RequestMapping("/age")
    @ResponseBody
    public int age(){
            return 7;
        }

}
