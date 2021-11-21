package org.nimble;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    Game game;

    @Before
    public void init(){
        game = new Game();
    }

    @Test
    public void testZeroPinsAllGameFrames()
    {
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        int score = game.getScore();
        assertEquals(0,score);
    }

    @Test
    public void testOneAndTwoPinsAllGameFrames(){
        for (int i = 0; i < 10; i++) {
            game.roll(1);
            game.roll(2);
        }
        int score = game.getScore();
        assertEquals(30,score);
    }

    @Test
    public void testSumOfFrameRollsPinsEqualsToTen(){
        game.roll(4);
        game.roll(6);
        game.roll(4);
        game.roll(3);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        int score = game.getScore();
        assertEquals(21,score);
    }

    @Test
    public void testFirstFrameWithOneRollEqualsToTen(){
        game.roll(10);
        game.roll(4);
        game.roll(3);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        int score = game.getScore();
        assertEquals(24,score);
    }

    @Test
    public void test5(){
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        int score = game.getScore();
        assertEquals(300,score);
    }
}
