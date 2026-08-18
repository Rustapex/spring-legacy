package com.acorn.prac2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalcProgramController {

    @Autowired
    Program p;

    @RequestMapping(value = "/cal", method = RequestMethod.GET)
    public String method1(int su1, int su2) {

        p.printCalc(su1, su2);

        return "home";
    }
}