package com.bs.bookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.bs.bookshop.dao.UserDao;
import com.bs.bookshop.dto.Users;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController 
{
	@Autowired
	UserDao userDao;
	
	@GetMapping("/loginPage")
	public String getLoginPage() 
	{
		return "redirect:login.html";
	}
	
	@PostMapping("/authenticate")
	public String validateUserDetails(@RequestParam("uname")String uname,@RequestParam("pword") String pword,Model model,HttpServletRequest request)
	{
		String message = "Invalid Username / Password....try again...!@";
		
		Users u = new Users(uname,pword);
		if(userDao.autheticateUser(u))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			return "redirect:books.html";
		}
		
		model.addAttribute("message", message);
		
		return "Display";
		
	}
	@GetMapping("/showBooks")
	public String getBooksByUsername(Model model)
	{
		model.addAttribute("booksList",userDao.getBooks());
		return "allBooks";
	}
	@GetMapping("/showBooksByCategory")
	public String getBooksByCategory(Model model)
	{
		model.addAttribute("categories",userDao.getAllCategories());
		return "allBooksByCategory";
	}
	
	@PostMapping("/submitCategory")
	public String submitCategory(@RequestParam("category") String category, Model model) 
	{
	    model.addAttribute("books", userDao.getBooksByCategory(category));
	    return "categoryResult";
	}
	
	@PostMapping("/buyBook")
	public String buyBook(@RequestParam("title") String title, Model model) {
	    boolean success = userDao.buyBook(title);    
	    if (success) {
	        model.addAttribute("message", "Book purchased successfully!");
	    } else {
	        model.addAttribute("message", "Sorry, the book is out of stock.");
	    }

	    model.addAttribute("books", userDao.getBooksByCategory("selectedCategory"));

	    return "Display";
	}
	


}
