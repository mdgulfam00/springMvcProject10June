package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    /// I have declared MyInterceptor class for demonstration of Interceptor concept.

    @RequestMapping("/interceptorform")
    public String interceptorHandler(){
        return "interceptorform";
    }

    @RequestMapping("/interceptorformhandler")
    public String handleInterceptor(@RequestParam("user")String name, Model m){
        System.out.println(name);
        m.addAttribute("name",name);
        return "showinterceptordetail";
    }


}
