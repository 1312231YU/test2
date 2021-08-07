package com.yumm.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/yumm")
public class HomeController {

    @GetMapping("/test")
    public void Test()
    {
        System.out.println("12345");
    }
}
