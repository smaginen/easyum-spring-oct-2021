package com.multiplication.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/index")
public class MultiplicationController {
    @RequestMapping(method = RequestMethod.GET)
    public String getMultiplication() {
        return "index";
    }
}