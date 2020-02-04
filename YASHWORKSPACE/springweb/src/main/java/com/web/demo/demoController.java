package com.web.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class demoController {
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req,HttpServletResponse res) {
//		HttpSession session =req.getSession();
//		System.out.println("Home........................................");
//		session.setAttribute("UserName","Pandurang (:) Poonam" );
//		return "home";
//	}
	String name="Pandurang (:) Poonam" ;
	@RequestMapping("home")
	public String home(@RequestParam("name") String name,HttpSession session) {
		session.setAttribute("UserName",name);
		return "home";
	}
}
