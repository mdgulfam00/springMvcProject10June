package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableAnnotationController {

    @RequestMapping("/checkpathvariable/{id}/{name}")
    public String getPathvariable(@PathVariable("id") int userId,@PathVariable("name") String userName){
        System.out.println("User Id is: "+userId);
        System.out.println("User Name is: "+userName);
        return "success";
    }

}
