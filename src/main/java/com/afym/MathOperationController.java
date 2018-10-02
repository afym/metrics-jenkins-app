package com.afym;

import com.afym.service.MathOperationApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathOperationController {
    @Autowired
    MathOperationApplication mathOperationApplication;

    @RequestMapping(value="/math/addition/{a}/{b}", method=RequestMethod.GET, produces="text/html")
    public String addition(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return mathOperationApplication.addition(a, b);
    }

    @RequestMapping(value="/math/multiple/{a}/{b}", method=RequestMethod.GET, produces="text/html")
    public String multiple(@PathVariable("a") Double a, @PathVariable("b") Double b) {
        return mathOperationApplication.multiple(a, b);
    }
}
