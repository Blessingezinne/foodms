package com.zinnybest.foodms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "/index";
    }
    @GetMapping("/index2")
    public String widget(){
        return "/index2";
    }
    @GetMapping("/hr")
    public String hr(){
        return "/hr/index";
    }
    @GetMapping("/foodstuffs")
    public String foodStore(){
        return "/foodstuffs/index";
    }
    @GetMapping("/accounts")
    public String account(){
        return "/accounts/index";
    }
    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }
    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }
    @GetMapping("/parameters")
    public String setting(){
        return "/parameters/index";
    }
}

