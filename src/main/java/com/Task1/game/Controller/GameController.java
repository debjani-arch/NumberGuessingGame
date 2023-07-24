package com.Task1.game.Controller;


import com.Task1.game.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/restart")
    public String restart(){
        gameService.restart();
        return "New Game Started. You have 5 attempts to guess the secret number ";

    }

    @GetMapping("/guess")
    public String guess(@RequestParam int number){
        return gameService.guess(number);
    }
}
