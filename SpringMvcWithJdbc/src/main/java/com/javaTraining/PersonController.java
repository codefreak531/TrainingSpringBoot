package com.javaTraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller

public class PersonController {

    @Autowired
    PersonDao personDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home(ModelAndView model) {
        List<Person> personList = personDao.list();
        model.addObject("personList", personList);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/newPerson", method = RequestMethod.GET)
    public ModelAndView newPerson(ModelAndView model) {
        Person person = new Person();
        model.addObject("person", person);
        model.setViewName("newPerson");
        return model;
    }

    @RequestMapping(value = "/savePerson")
    public ModelAndView savePerson(@ModelAttribute Person person) {
        personDao.saveOrUpdate(person);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
    public ModelAndView deletePerson(HttpServletRequest httpServletRequest) {
        int id = Integer.parseInt(httpServletRequest.getParameter("id"));
        personDao.delete(id);
        return new ModelAndView("redirect:/");
    }
}




