package kr.or.connect.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlusController {
	@GetMapping(path = "/plusform")
	public String plusform() {
		return "plusForm";
	}
	
	@PostMapping(path = "/plus")
	public String plus(@RequestParam(name = "value1" , required = true) int value1, @RequestParam(name = "value2" , required = true) int value2, ModelMap modelMap) {
		int result = value1 + value2;
		
		//httprequest사용하면 http에 종속적이게 되므로 이렇게 스프링이 제공하는 modelMap과 같은 객체를 이용한다. ModelAndView 객체도 있음
		modelMap.addAttribute("value1", value1);
		modelMap.addAttribute("value2", value2);
		modelMap.addAttribute("result", result);
		return "plusResult";
	}
	
}
