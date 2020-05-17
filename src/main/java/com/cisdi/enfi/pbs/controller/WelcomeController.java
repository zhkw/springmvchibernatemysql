package com.cisdi.enfi.pbs.controller;

import com.cisdi.enfi.pbs.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired
    private BankAccountService bankAccountService;

    @RequestMapping("/welcome")
    public String Welcome(ModelMap map){
        map.put("name","zkw");
        return "welcome";
    }

    @RequestMapping("/main")
    public String ListAccounts(ModelMap map){
        map.addAttribute("todos",bankAccountService.getAll());
        return "main";
    }
}
