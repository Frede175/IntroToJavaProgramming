
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fsr19
 */
public class Chapter8 {
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int i = 0; i < m[rowIndex].length; i++) {
            sum += m[rowIndex][i];
        }
        return sum;
    }
    
    public void task_01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] m = new double[3][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Sum of the elements at row " + i + " is " + sumRow(m, i));
        }
    }
    
    /**
     * Function to check which player has won a game of tic-tac-toe
     * @param board play area tic-tac-toe
     * @return the char of the player who has won, if no winner returns SPACE char. If draw char returned is 'D'
     */
    private char checkStatus(char[][] board) {
        //Check the rows:
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        
        //Check the colums:
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        
        //Check the diagonals:
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != ' ') return board[0][0];
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ') return board[0][2];
       
        //Check draw:
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return ' ';
        
        
        return 'D';
    }
    
    private void drawBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println("——————-—");
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
        }
        System.out.println("——————-—");
    }
    
    
    
    public void task_09() {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char turn = 'X';
        
        //Fill board with ' ':
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            } 
        }
        
        char playerWon = ' ';
        int row, col;
        while ((playerWon = checkStatus(board)) == ' ') {
            drawBoard(board);
            System.out.print("Enter a row (0, 1, or 2) for player " + turn + ": ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + turn + ": ");
            col = scanner.nextInt();
            board[row][col] = turn;
            if (turn == 'X') turn = 'O';
            else turn = 'X';
        }
        drawBoard(board);
        if (playerWon == 'D') System.out.println("Draw game");
        else System.out.println("Player " + playerWon + " won!");
        
    }
    
    public static boolean isMarkovMatrix(double[][] m) {
        for (int i = 0; i < 3; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                if (m[i][j] < 0) return false;
                sum += m[i][j];
            }
            if (sum != 1) return false;
        }
        return true;
    }
    
    
    public void task_25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] m = new double[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = scanner.nextDouble();
            }
        }
        
        if (isMarkovMatrix(m)) System.out.println("It is a Markov matrix");
        else System.out.println("It is not a Markov matrix");
    }
}
