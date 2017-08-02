/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.poo.tema4;

/**
 *
 * @author IONESCU
 */
public class GameEngine {

    private int valueToGuess;
    private int secondsAvailable1;
    private final long beginTime = System.currentTimeMillis();

    public GameEngine() {
    }

    public GameEngine(int valueToGuess1, int secondsAvailable) {
        this.valueToGuess = valueToGuess1;
        this.secondsAvailable1 = secondsAvailable;

    }

    public long returnBegintime() {
        return beginTime;
    }

    public GuessResult guess(int value) throws TimeoutException {

        long currTime = System.currentTimeMillis() - beginTime;

        if (currTime >= secondsAvailable1) {
            throw new TimeoutException("Time is up! You lose.");
        }

        return new GuessResult(value, valueToGuess);

    }
}
