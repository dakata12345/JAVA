/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.poo.tema4;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

public class Main {

    public static void timeOut(GameEngine newGame) throws TimeoutException {
        if (newGame.returnBegintime() - System.currentTimeMillis() >= 10000) {
            throw new TimeoutException("Time is up! You lose.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(101);
        System.out.println(numberToGuess);
        int inputNumber;
        boolean gameWon = false;
        GameEngine newGame = new GameEngine(numberToGuess, 10000);
        boolean time = true;
        try {
            while (!gameWon) {
                timeOut(newGame);
                inputNumber = scanner.nextInt();
                GuessResult firstGuess = newGame.guess(inputNumber);
                if (firstGuess.isWon()) {
                    gameWon = true;
                }
                System.out.println(firstGuess.toString());

            }

        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }

    }
}
