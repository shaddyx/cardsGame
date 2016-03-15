package ua.org.shaddy.cardsgame.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

import ua.org.shaddy.cardsgame.util.json.JsonHelper;

@Controller
public class GameController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	JsonHelper jsonHelper;
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE, value = "create")
	public String mainUi(HttpServletResponse response) throws IOException{
		return "";
	}
		
}
