/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jocul_literelor;

import java.util.Scanner;

/**
 *
 * @author dakata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String []s1 = s.split(" ");
        String alpha,beta;
        alpha = s1[0].toLowerCase();
        beta = s1[1].toLowerCase();
        int n,m;
        m = Integer.parseInt(s1[2]);
        n = Integer.parseInt(s1[3]);
        
        String s2 = scanner.nextLine();
        String []s3 = s2.split(" ");
        int no1=0,no2=0,no3=0;
        for (int i = 0 ; i < s3.length;i++){
            s3[i] = s3[i].toLowerCase();
            if (s3[i].startsWith(alpha) && (s3[i].endsWith(beta))){
                System.out.println(s3[i]);
                if (s3[i].length() < m){
                    no1++;
                } else if ((s3[i].length()>=m) && (s3[i].length() < n)) {
                    no2++;
                } else if (s3[i].length()>=n){
                    no3++;
                }              
            }
        }
        System.out.printf("%d %d %d",no1,no2,no3);
    }
    
}
