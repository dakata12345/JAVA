/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imbunatatirecontrast;

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
        int lines,columns;
        lines = scanner.nextInt();
        columns = scanner.nextInt();
        int [][] matrix = new int[lines][columns];
        int [][] new_matrix = new int[lines][columns];
        int [][] matrix_2 = new int[lines][columns];
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                matrix[i][j] = scanner.nextInt();
                double f = matrix[i][j]*0.9f + 2;
                new_matrix[i][j] =  (int) Math.floor(f);
            }
        }
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                System.out.printf("%d ",new_matrix[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                matrix_2[i][j] = new_matrix[i][j]- matrix[i][j];
            }
        }
        
           
        float sum = 0;
        for (int i = 0 ; i < lines;i++){
            for (int j = 0 ; j < columns;j++){
                sum+=matrix_2[i][j];
            }
        }
        
        System.out.printf("%.2f",sum/(lines* columns));
        
    }
    
}
