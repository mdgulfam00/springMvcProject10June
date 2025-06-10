package controllers;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception{
        System.out.println("This is form prehandler....");

        String user = request.getParameter("user");
        if(user.startsWith("d")){
            response.setContentType("text/html");
            response.getWriter().println("Invalid name.... name should not starts with 'D'...");
            System.out.println("Name cannot start with 'D'. Thank you....");
            return false;
        }
        return true;
    }
}
