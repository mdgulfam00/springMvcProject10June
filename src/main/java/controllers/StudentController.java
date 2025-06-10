package controllers;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private List<User> students = new ArrayList<>();

    @RequestMapping("/showform")
    public String showForm(Model model){
        model.addAttribute("student",new User());
        return "studentDetails";
    }

    @RequestMapping(path = "/addstudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute User user,Model model){
        students.add(user);
        System.out.println(students);
        model.addAttribute("user",user);
        model.addAttribute("student",students);
        return "showStudent";
    }

    @RequestMapping("/search")
    public String searchStudent(Model model){
       for(User user : students){
           if(user.getUsername().equals("kg1tlk5r")){
               model.addAttribute("student",user);
               return "searchPage";
           }
           else{
               System.out.println("There is no one present with this name.....");
           }
       }
        return "emptySearchPage";
    }











    //@RequestMapping("/addstudent")
    public String studentRegister(@RequestParam("email") String studentEmail,
                                  @RequestParam("username")String studentUserName,
                                  @RequestParam("password")String studentPassword, Model m)
    {
        System.out.println("Student Name:"+studentUserName);
        System.out.println("Student Email:"+studentEmail);
        System.out.println("Student Password:"+studentPassword);


        m.addAttribute("name",studentUserName);
        m.addAttribute("email",studentEmail);
        m.addAttribute("password",studentPassword);
        return "showStudent";
    }


}
