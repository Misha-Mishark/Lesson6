package Guessing_Game;

import java.util.Random;

public class Guessing_Machine {

    int numGuesses;
    int target_num;
    int recent_guess;

    Random r = new Random();

    public Guessing_Machine() {
        target_num = r.nextInt(100) + 1;
        numGuesses = 0;
    }

    public String giveHint() {
        if (recent_guess > target_num) {
            return "Sorry-Guess Lower";
        } else if (recent_guess < target_num) {
            return "Sorry-Guess Higher";
        } else {
            return "You got it!";
        }
    }

    public boolean setGuess(int number) {
        recent_guess=number;
        if (1<=recent_guess &&100>= recent_guess){ 
            numGuesses++;
            return true;
        }
        else return false;
    }
    
    public int getnumGuesses(){
        return numGuesses;
    }
}
