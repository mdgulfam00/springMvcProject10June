package controllers;

import model.ComplexFormEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexFormController {

    @RequestMapping("/showcomplexform")
    public String showComplexForm(){
        return "complexForm";
    }


    @RequestMapping(path = "handlecomplexform",method = RequestMethod.POST)
    public String handlecomplexform(@ModelAttribute("student")ComplexFormEntity student){
        System.out.println(student);
        return "showcomplexformvalues";
    }

}
