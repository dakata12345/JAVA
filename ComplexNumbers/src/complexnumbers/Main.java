/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumbers;

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
        System.out.println("Introduceti partea reala si partea imaginara pentru primul numar");
        int real1 = scanner.nextInt();
        int imag1 = scanner.nextInt();
        System.out.println("Introduceti partea reala si partea imaginara pentru al doilea numar");
        int real2 = scanner.nextInt();
        int imag2 = scanner.nextInt();
        ComplexNumber c1 = new ComplexNumber(real1, imag1);
        ComplexNumber c2 = new ComplexNumber(real2, imag2);
        ComplexNumber c3 = ComplexNumber.getSum(c1, c2);
         String c;
         if (c3.getImaginaryPart() > 0){
             c = " + ";
         } else {
             c = "";
         }
        System.out.println(c3.getRealPart() + c + c3.getImaginaryPart() + "*i");
    }
    
}
