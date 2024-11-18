package com.saiee.webmvc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.saiee.webmvc.dao.UsersDao;
import com.saiee.webmvc.dto.Users;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController 
{
	@Autowired
	UsersDao userDao;
	
	@GetMapping("/loginPage")
	public String getLoginPage() 
	{
		return "redirect:login.html";
	}
	
	/*@PostMapping("/authenticate")
	public ModelAndView validateUserDetails(@RequestParam("uname")String uname,@RequestParam("pword") String pword)
	{
		String message = "Invalid Username / Password....try again...!@";
		
		Users u = new Users(uname,pword);
		if(userDao.authenticateUser(u))
			message = "Welcome to the Website";
		
		ModelAndView mv = new  ModelAndView("Display","message",message);
		
		return mv;
		
	}*/
	
	@PostMapping("/authenticate")
	public String validateUserDetails(@RequestParam("uname")String uname,@RequestParam("pword") String pword,Model model,HttpServletRequest request)
	{
		String message = "Invalid Username / Password....try again...!@";
		
		Users u = new Users(uname,pword);
		if(userDao.autheticateUser(u))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			return "redirect:services.html";
		}
		
		model.addAttribute("message", message);
		
		return "Display";
		
	}
	
	@GetMapping("/moneytransferform")
	public String getMoneyTransferForm()
	{
		return "redirect:moneytransferform.html";
	}
	
	@GetMapping("/transferMoney")
	public String doTransferMoney(@SessionAttribute("username") String username,@RequestParam("amount") double amount,Model model)
	{
		String message = "Money Transfer Failed";
		if(userDao.findBalance(username) - amount < 0 )
			message = "No suffecient Funds"+amount;
		else if(userDao.transferAmount(username, amount))
			message = "Amount Transfered Successfully";
		model.addAttribute("message",message);
		
		return "Display";
		
	}
	
	@GetMapping("/showTransactions")
	public String getTransactionsByUsername(@SessionAttribute("username") String username,Model model)
	{
		model.addAttribute("transList",userDao.getTransactionsByUsername(username));
		return "ShowTransaction";
	}
	
	
	
}
