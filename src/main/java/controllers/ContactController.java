package controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String getForm(){
        return "contact";
    }

    //Demonstration of @RequestParam annotation
    //@RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String userEmail,
                             @RequestParam("username") String userName,
                             @RequestParam("password") String userPassword, Model m)//will help us to extract variables of views
    {
        System.out.println("UserEmail:"+userEmail);
        System.out.println("UserName:"+userName);
        System.out.println("UserPassword:"+userPassword);

// Sending data from Controller back to views to view on web pages..and then we will pass Model object in parameter

        m.addAttribute("email",userEmail);
        m.addAttribute("username",userName);
        m.addAttribute("password",userPassword);
        return "success";
    }

    // demonstration of @ModelAttribute annotation
    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model m)
    {
        //@ModelAttribute annotation will do 3 work:-
        //It makes the User object and then it fetches all the infromation from form and then set all
        //the fields(using getter and setter) of User class with the fetched values.
        //It also sends all the variables in (success) view by using user.variable_name.

        System.out.println(user);
        return "success";
    }



}
