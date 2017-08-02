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
public class GuessResult extends GameEngine {

    private int valueToGuess;
    private int tryValue;

    public GuessResult() {
    }

    public GuessResult(int tryValue1, int valueToGuess1) {
        this.valueToGuess = valueToGuess1;
        this.tryValue = tryValue1;
    }

    public boolean isWon() {
        return tryValue == valueToGuess;
    }

    public String toString() {
        if (tryValue > valueToGuess) {
            return "Try LOWER!";
        }

        if (tryValue < valueToGuess) {
            return "Try HIGHER!";
        }

        return "Exactly, you WIN!";
    }

}
