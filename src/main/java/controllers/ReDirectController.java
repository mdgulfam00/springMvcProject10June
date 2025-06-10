package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {

    /// demostration of redirect:prefix
    @RequestMapping("/one")
    public String one(){
        System.out.println("This is first controller...");
        return "redirect:/enjoy";
    }
/// jab hm '/one' fire krenge then redirect ki help se '/enjoy' fire hoga aor fir contact wala .jsp show hoga
    @RequestMapping("/enjoy")
    public String enjoy(){
        System.out.println("This is second controller...");
        return "contact";
    }

    /// demonstration of rediretView
    //@RequestMapping("/one")
    public RedirectView two(){
        System.out.println("Redirect View Page....");
        RedirectView object = new RedirectView();
        object.setUrl("enjoy");
        return object;
    }

    @RequestMapping("/redirectgoogle")
    public RedirectView redirectToGoogle(){
        return new RedirectView("http://www.google.com");
    }

}
