package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public ModelAndView getPage(){
        System.out.println("Nothing printed on screen.....");
        ModelAndView m = new ModelAndView();
        m.setViewName("welcome");
        return m;
    }

    // demonstration of Model class
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Hello We are in home page of application....");
        model.addAttribute("name","Saziya Khan");
        model.addAttribute("id",4321);

        List<String> freinds = Arrays.asList("Gulfam","heena","Meena","Teena","Reena");
        model.addAttribute("listOfFreinds",freinds);
        return "index";
    }

    // demonstration of ModelAndView class
    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("Inside help Section....");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","Zaid Khan");
        modelAndView.addObject("address","Bahadurpur");
        LocalDateTime time =  LocalDateTime.now();
        modelAndView.addObject("loggedInTime",time);


        modelAndView.setViewName("help");

        return modelAndView;
    }

    //demonstartion of injecting JSP expression language i.e. ${keyName} and JSTL library
    @RequestMapping("/about")
    public ModelAndView about(){
        System.out.println("About Page....");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("year",10);
        modelAndView.addObject("school","St. Xavier's");
        modelAndView.addObject("fees",14000);
        List<Integer> marksObtained = Arrays.asList(45,32,23,47,41);
        modelAndView.addObject("marks",marksObtained);

        modelAndView.setViewName("about");
        return modelAndView;
    }
}
