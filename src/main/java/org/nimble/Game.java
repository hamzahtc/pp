package org.nimble;

public class Game {

    private int score;
    private int frameCounter;
    private int frameSum;
    private boolean isBonus;
    private int prev;
    private int cpt;
    public void roll(int pins){
        if(pins == 10){
            isBonus = true;
            cpt++;
        }
        if(pins == 10 && prev != 10) prev = pins;
        else{
            if(frameCounter < 2) frameSum +=pins;
            else {
                if(cpt != 10){
                    if(frameSum == 10) pins *= 2;
                    if(isBonus){
                        score += frameSum;
                        isBonus = false;
                    }
                    frameCounter = 0;
                }
            }
            frameCounter++;
        } 
        score += pins;
    }

    public int getScore(){
        return score;
    }
}
