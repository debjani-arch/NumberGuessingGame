package com.Task1.game.Service;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private int secretNumber;

    private int remainingAttempts;


    public void restart(){
        secretNumber = (int) (Math.random()*100)+1;
        remainingAttempts = 5;

    }

    public String guess(int number){
        if(remainingAttempts <=0){
            return "Sorry, you have used all your attempts. The Secret Number is "+ secretNumber;

        } else if (number == secretNumber) {
            return "Congratulations!! you have guessed the Secret Number in " + (4 - remainingAttempts) + " attempts";
        } else if (number < secretNumber) {
            remainingAttempts--;
            if(remainingAttempts == 0){
                return "Sorry, you have used all your attempts. The Secret Number is "+ secretNumber;

        }
        return "The Secret Number is higher than " + number + ". You have " + remainingAttempts + " attempts left";
    }else{
            remainingAttempts--;
            if(remainingAttempts == 0){
                return "Sorry, you have used all your attempts. The Secret Number is "+ secretNumber;

            }
            return "The Secret Number is lower than "  + number + ". You have " + remainingAttempts + " attempts left";
        }
    }
}
