package ua.org.shaddy.cardsgame.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.org.shaddy.cardsgame.util.json.JsonHelper;

@Controller
public class HomeController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	JsonHelper jsonHelper;
	
	@RequestMapping(value="mainUi")
	public ModelAndView mainUi(HttpServletResponse response) throws IOException{
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletResponse response) throws IOException {
		ModelAndView modelAndView = new ModelAndView("index");
		/*modelAndView.addObject("revision", BuildInfoUtils.readBuildInfo().get("revision"));
		modelAndView.addObject("branch", BuildInfoUtils.readBuildInfo().get("branch"));*/
		return modelAndView;
	}
		
}
