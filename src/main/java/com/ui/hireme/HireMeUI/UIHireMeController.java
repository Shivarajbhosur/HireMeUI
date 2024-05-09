package com.ui.hireme.HireMeUI;

import com.ui.hireme.HireMeUI.constant.ViewNameConstants;
import com.ui.hireme.HireMeUI.model.LoginEntity;
import com.ui.hireme.HireMeUI.model.RegisterModel;
import com.ui.hireme.HireMeUI.response.Response;
import com.ui.hireme.HireMeUI.service.Registerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UIHireMeController {

    private final Registerservice service;

    @Autowired
    public UIHireMeController(Registerservice service) {

        this.service = service;
    }

    @GetMapping({"/","/login"})
    public String getHome()
    {
    	
    	System.out.println("Inside login");
        return ViewNameConstants.viewName_LOGIN;
    }
    
    @GetMapping("/test")
    public String testServerUp() {
    	System.out.println("Inside test method");
    	return "server Up and working";
    }

    @PostMapping("/login")
    public ModelAndView loginUser(LoginEntity login){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("Login details: "+ login);
        Response response =  service.loginUser(login);
        if (response.getMsg().equals("SUCCESS")) {
            modelAndView.setViewName(ViewNameConstants.viewName_HOME);
            modelAndView.addObject("Status", "Successfully logged in to HireMe APP, Enjoy your job search all the best");
        } else {
            modelAndView.setViewName(ViewNameConstants.viewName_LOGIN);
            modelAndView.addObject("Status", "User credentials Not matching. please check, if not registered please register");
        }

        return modelAndView;
    }

    //called when user clicked on register in login page
    @GetMapping("/register")
    public  String getRegisterPage()
    {
        return ViewNameConstants.viewName_REGISTER;
    }

//post create metghod , get data, frokm jsp, s store data in bean

    //Called when user clicked on register button in register form
   @PostMapping("/home")
    public ModelAndView registerModel(RegisterModel registerModel) {
       ModelAndView modelAndView = new ModelAndView();

       System.out.println("in model" + registerModel);
       // Call the RegisterService method and return its response
       Response response = service.registerUser(registerModel);
       if (response.getMsg().equals("SUCCESS")) {
           modelAndView.setViewName(ViewNameConstants.viewName_LOGIN);
           modelAndView.addObject("Status", "Successfully registered to HireMe APP, Please Login");
       } else {
           modelAndView.setViewName(ViewNameConstants.viewName_HOME);
       }

       return modelAndView;
   }
}
