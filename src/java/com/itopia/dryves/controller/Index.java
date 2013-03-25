/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itopia.dryves.controller;

import com.itopia.dryves.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Index {
	
	@Autowired
	Environment env;
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		
		model.addAttribute("body", model.addAttribute("hello", "hello world!"));

		return "doctype/html5";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView test()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		
		return new ModelAndView("doctype/html5", "body", model);
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, 
	ModelMap model) {
	   model.addAttribute("name", student.getName());
	   model.addAttribute("age", student.getAge());
	   model.addAttribute("id", student.getId());

	   return "result";
	}

}
