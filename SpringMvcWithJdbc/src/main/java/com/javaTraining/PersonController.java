package com.javaTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class PersonController {

    @Autowired
    PersonDao personDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(ModelAndView model){
        List<Person> personList = personDao.list();
        model.addObject("personList",personList);
        model.setViewName("home");
        return model;
    }
}
