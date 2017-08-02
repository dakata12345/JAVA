/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutaribacktracking;

import java.util.Scanner;

/**
 *
 * @author dakata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void backtracking(int [] array){
        int [] x = new int[array.length];
        int k = 0;
        int noSol = 0;
        for (int i = 0 ; i < x.length;i++){
            x[i] = 0;
        }
        while(k >= 0){
            if (k == x.length){
                printSol(x,++noSol);
                k--;
            } else if (x[k]<x.length){
                x[k]++;
                if (continuare(x,k)){
                    k++;
                }
            } else {
                x[k--] = 0;
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String []cuv = s.split(" ");
        int [] array = new int[cuv.length];
        for (int i = 0 ; i < array.length;i++){
            array[i] = Integer.parseInt(cuv[i]);
        }
        backtracking(array);
        
    }

    private static void printSol(int[] x, int noSol) {
    System.out.println("Permutarea cu numarul" + " " + noSol + " ");       
    for (int i = 0 ; i < x.length;i++){
       System.out.printf("%d ",x[i]);
       }
        System.out.println("");
    }

    private static boolean continuare(int[] x, int k) {
        for (int i = 0 ; i < k ; i++){
            if (x[k] == x[i]){
                return false;
            }
        }
        return true;
    }
    
}
