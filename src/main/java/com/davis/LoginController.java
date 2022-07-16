package com.davis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	LoginDAO loginDao = new LoginDAO();
	
	@RequestMapping("/login")
	public ModelAndView loginUser(HttpServletRequest req, HttpServletResponse res) {
		
		String uname = req.getParameter("username");
		String password = req.getParameter("password");
		String result = null;
		result = loginDao.Validate(uname, password);
		
		ModelAndView mv = new ModelAndView();
		if(result.equals("Success")) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",uname);
		}else {
			mv.setViewName("index1.jsp");
		}
		
		return mv;		
	}
	
	@RequestMapping("/register")
	public ModelAndView registerUser(HttpServletRequest req, HttpServletResponse res) {
		
		String fname = req.getParameter("fname");
		String branch = req.getParameter("branch");
		String contact = req.getParameter("contact");
		String email = req.getParameter("email");
		String uname = req.getParameter("uname");
		String password = req.getParameter("password");
		String result = null;
		result=loginDao.userRegistration(fname, branch, contact, email, uname, password);		
		ModelAndView mv = new ModelAndView();
		if(result!=null) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",uname);
		}else {
			mv.setViewName("Registration1.jsp");
		}				
		return mv;		
	}
}
