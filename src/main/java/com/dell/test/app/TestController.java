package com.dell.test.app;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class TestController {
	
	@RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Just checking if everything works fine";
    }
}

 


 
    