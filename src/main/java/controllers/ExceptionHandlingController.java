package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlingController {

    @RequestMapping("/handlexception")
    public String test(){
        System.out.println("Hello This is gulfam from sultanpur");
        String  str = null;
        int arr[] = new int[3];
        arr[3] = 5;
        System.out.println("Length:"+str.length());
        return "welcome";
    }

    @ExceptionHandler({NullPointerException.class, ArrayIndexOutOfBoundsException.class})
    public String handleExceptions(){
        System.out.println("Exception handleddd...");
        return "handleException";
    }

}
