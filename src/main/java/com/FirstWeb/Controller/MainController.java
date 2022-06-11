package com.FirstWeb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.FirstWeb.model.UserForm;

@Controller
public class MainController 

{

	@RequestMapping("/homehtml")
	public String HomePage() 
	{
		System.out.println("Inside home controler html");
		
		return "home.html";	
	}
	
	
	@RequestMapping("/homejsp")
	public String HomePage2(HttpServletRequest request,@RequestParam("data") String value,ModelMap model) 
	{
		model.addAttribute("value", value);
	    System.out.println("param value" + value);
		System.out.println("Inside home controler jsp ");
		
		return "home.jsp";	
	}
	
	@RequestMapping("/form")
	public String form() 
	{
		System.out.println("Inside form controler ");
		
		return "form.jsp";	
	}
	
	@RequestMapping("/addstudentform")
	public ModelAndView addstudentform(UserForm userform) 
	{
		
		ModelAndView view=new ModelAndView("home.jsp");
		view.addObject("object",userform);
		System.out.println("Inside form");
		System.out.println("THe Objectuserform Value is  " +userform	 );
		
		return view;	
	}
	
	@RequestMapping("/ragister")
	public String Ragister() {
		System.out.println("Ragister++++++++++++");
		return "Ragister";
		
		
	}
	
}
