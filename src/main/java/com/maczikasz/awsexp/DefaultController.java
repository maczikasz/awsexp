package com.maczikasz.awsexp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maczikasz on 16.02.16.
 */
@Controller
@RequestMapping("default/")
public class DefaultController {


    @RequestMapping("hello")
    public String hello() {
        return "Hello";
    }
}
