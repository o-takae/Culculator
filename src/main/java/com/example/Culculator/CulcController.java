package com.example.Culculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class CulcController {
	
	@RequestMapping("/")
    public String index() 
	{	
        return "input.html";	
    }	
	
	
	@PostMapping(path="/add")
	public String add(   Model model
					   , @RequestParam String in_first 
					   , @RequestParam String in_second
					 ) 
	{
		float sum = 0;
		try {
			sum = Float.parseFloat(in_first) + Float.parseFloat(in_second);
		} catch (NumberFormatException e) {
			model.addAttribute("msg","数値（半角）を入力してください。");
	        return "input.html";
	    }
		
		model.addAttribute("a_culc_in_first",in_first);
		model.addAttribute("a_culc_in_second",in_second);
		model.addAttribute("a_culc_out",sum);
		
		return "output.html";
	}
	
	@PostMapping(path="/subtraction")
	public String subtraction(   Model model
					   , @RequestParam String in_first 
					   , @RequestParam String in_second
					 ) 
	{
		float sum = 0;
		try {
			sum = Float.parseFloat(in_first) - Float.parseFloat(in_second);
		} catch (NumberFormatException e) {
			model.addAttribute("msg","数値（半角）を入力してください。");
	        return "input.html";
	    }
		
		
		model.addAttribute("s_culc_in_first",in_first);
		model.addAttribute("s_culc_in_second",in_second);
		model.addAttribute("s_culc_out",sum);
		
		return "output.html";
	}
	
	@PostMapping(path="/multiplication")
	public String multiplication(   Model model
					   , @RequestParam String in_first 
					   , @RequestParam String in_second
					 ) 
	{
		float sum = 0;
		try {
			sum = Float.parseFloat(in_first) * Float.parseFloat(in_second);
		} catch (NumberFormatException e) {
			model.addAttribute("msg","数値（半角）を入力してください。");
	        return "input.html";
	    }
		
		
		model.addAttribute("m_culc_in_first",in_first);
		model.addAttribute("m_culc_in_second",in_second);
		model.addAttribute("m_culc_out",sum);
		
		return "output.html";
	}
	
	@PostMapping(path="/division")
	public String division(   Model model
					   , @RequestParam String in_first 
					   , @RequestParam String in_second
					 ) 
	{
		float sum = 0;
		try {
			sum = Float.parseFloat(in_first) / Float.parseFloat(in_second);
		} catch (NumberFormatException e) {
			model.addAttribute("msg","数値（半角）を入力してください。");
	        return "input.html";
	    }
		
		
		model.addAttribute("d_culc_in_first",in_first);
		model.addAttribute("d_culc_in_second",in_second);
		model.addAttribute("d_culc_out",sum);
		
		return "output.html";
	}


}
