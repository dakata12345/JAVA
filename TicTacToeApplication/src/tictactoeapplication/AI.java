/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author IONESCU
 */
class AI {

    public int picSpot(TicTacToe game) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (game.board[i] == '-') {
                list.add(i + 1);

            }
        }
        Random rand = new Random();
        int choice = list.get(Math.abs(rand.nextInt() % list.size()));
        return choice;
    }

}
