package ua.org.shaddy.cardsgame.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ua.org.shaddy.cardsgame.game.entities.Game;
import ua.org.shaddy.cardsgame.game.logic.GameService;
import ua.org.shaddy.cardsgame.util.json.ResponseHelper;

@Controller
@RequestMapping(value = "/game")
public class GameController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	ResponseHelper jsonHelper;
	
	@Autowired
	GameService gameService;
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE, value = "/create")
    @ResponseBody
    public String create(){
		Game game = gameService.create();
		return jsonHelper.toJsonAnswer(game);
	}
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE, value = "/get")
    @ResponseBody
    public String get(@RequestParam long id){
		return jsonHelper.toJsonAnswer(gameService.get(id));
	}
		
}
