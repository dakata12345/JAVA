/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeapplication;

/**
 *
 * @author IONESCU
 */
public class TicTacToe {

    protected char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerMarker, char aiMarker) {
        this.userMarker = playerMarker;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
        this.currentMarker = userMarker;

    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }

    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot - 1] = currentMarker;
            currentMarker = (currentMarker == userMarker) ? aiMarker : currentMarker;
        }
        return isValid;
    }

    public boolean withinRange(int number) {
        return number > 0 && number < board.length + 1;
    }

    public boolean isSpotTaken(int number) {
        return board[number - 1] != '-';
    }

    public void printBoard() {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println();
                System.out.println("------------");
            }
            System.out.println("|" + board[i]);
        }
        System.out.println();
    }

    public static void printIndexBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            if ((i % 3 == 0) && (i != 0)) {
                System.out.println();
                System.out.println("------------");
            }
            System.out.println("|" + i + 1);
        }
        System.out.println();
    }

    public boolean isthereaWinner() {
        boolean diagonalsandMiddles = (rightDi() || leftDi() || middleRow() || secondCol()) && board[4] != '-';
        boolean topandFirst = (topRow() || firstCol()) && board[0] != '-';
        boolean bottomandThird = (bottomRow() || thirdCol()) && board[8] != '-';
        if (diagonalsandMiddles) {
            this.winner = board[4];
        } else if (topandFirst) {
            this.winner = board[0];
        } else if (bottomandThird) {
            this.winner = board[8];
        }
        return diagonalsandMiddles || topandFirst || bottomandThird;

    }

    private boolean leftDi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    private boolean rightDi() {
        return board[0] == board[4] && board[4] == board[8];
    }

    private boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    private boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    }

    private boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    private boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];

    }

    private boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    private boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    public boolean istheboardFull() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == '-') {
                return false;
            }

        }
        return true;
    }

    public String gameOver() {
        boolean didsomeoneWin = isthereaWinner();
        if (didsomeoneWin) {
            return "We have a winner ! The winner is " + this.winner + "'s";
        } else if (istheboardFull()) {
            return "Draw , Game Over !";
        }
        return "Not over yet.";
    }

}
