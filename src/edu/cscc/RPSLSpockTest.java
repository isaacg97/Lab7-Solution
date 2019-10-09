package edu.cscc;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Isaac Goode, 10/9/2019, tests the RPSLSpockTest class' methods
 */
public class RPSLSpockTest {

    @Test
    public void testIsValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));

        Assert.assertFalse(RPSLSpock.isValidPick(null));
    }

    @Test
    public void testGeneratePick() {
        for (int i = 0; i < 1000000; i++) {
            String h_pick = RPSLSpock.generatePick();
            RPSLSpock.isValidPick(h_pick);
        }
    }

    @Test
    public void testIsComputerWin() {
        //asserts true 10 times
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));

        //asserts false
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.LIZARD, RPSLSpock.ROCK));
    }

}