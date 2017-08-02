/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

import java.util.Scanner;

/**
 *
 * @author IONESCU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        boolean doyouwanttoPlay = true;
        while (doyouwanttoPlay) {

            System.out.println("Welcome to TIC-TAC-TOE ! " + "You are going against the COMPUTER \n");
            System.out.println("Pick the character you want to be and the character i will be ");
            System.out.println();
            System.out.println("Enter the character that represents you");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter the computer character");
            char aiToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, aiToken);
            AI ai = new AI();
            System.out.println();
            System.out.println("WE  cand start the game enter your number the number go from 1-9 left to right");
            TicTacToe.printIndexBoard();
            System.out.println();
            while (game.gameOver().equals("Not over yet.")) {
                if (game.currentMarker == game.userMarker) {
                    System.out.println("Your turn");
                    int spot = scanner.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again " + spot + " is invalid");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked the spot " + spot);
                } else {
                    System.out.println("It's my turn");
                    int aiSpot = ai.picSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked" + aiSpot);
                    System.out.println();
                    game.printBoard();
                    game.currentMarker = game.userMarker;

                }
            }
                System.out.println();
                System.out.println(game.gameOver());
                System.out.println();
                System.out.println("Do you want to play again ?" + " Enter y if yes otherwise eneter whatever");
                char response = scanner.next().charAt(0);
                doyouwanttoPlay = (response == 'Y');
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }

    }
