package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping("/searchkeyword")
    public String search(){
        System.out.println("Going to search page....");
        return "searchkeyword";
    }

    @RequestMapping("/dosearch")
    public RedirectView dosearch(@RequestParam("querybox")String keyword){
        RedirectView redirectView = new RedirectView();
        if(keyword==""){
            redirectView.setUrl("searchkeyword");
            return redirectView;
        }
        String url = "https://www.google.com/search?q="+keyword;

        redirectView.setUrl(url);
        return redirectView;
    }
}
