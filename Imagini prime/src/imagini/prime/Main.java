/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagini.prime;

import java.util.Scanner;

/**
 *
 * @author IONESCU
 */
public class Main {

    
    public static boolean isPrime(int n){
        if (n == 2){
            return true;
        } else if (n==0 || n == 1){
            return false;
        } else{
        for (int i = 2 ; i <= n ; i++){
            if (n%i == 0 & n!=i) return false;
        }
        }
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scanner = new Scanner(System.in);
        int lines,columns;
        lines = scanner.nextInt();
        columns = scanner.nextInt();
        int [][] matrix = new int[lines][columns];
        int [][] matrix_new = new int[lines][columns];
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                if (isPrime(matrix[i][j])) matrix_new[i][j] = 0;
                else matrix_new[i][j] = 1;
            }
        }
        int sum = 0;
         for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                if (matrix_new[i][j]==1) sum++;
            }
        }
         System.out.println(sum);
         
        
    }
    
}
