package com.javaTraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/abc")
public class HelloControllor {

    @RequestMapping(method = RequestMethod.GET)
    public String helloABC(ModelMap modelMap){
        modelMap.addAttribute("message","Hellow Spring MVC");
        return "hello";
    }
}
