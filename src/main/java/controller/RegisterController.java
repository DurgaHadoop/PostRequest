package controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import beans.RegisterBean;


@Controller
public class RegisterController 
{
	@RequestMapping("/")
    public String getFomr(Model m)
    {
		RegisterBean r=new RegisterBean();
		 m.addAttribute("register1",r);
    	return "registration";
    }
	@RequestMapping("/register")
	public String register(@ModelAttribute("register1") RegisterBean r)
	{
	  
	  return "registration";
	}
}

