/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transcodor;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            
            String s = scanner.nextLine();
           
            String out = null;
                switch (s) {
                    case "1,1,1,1,1,1,0,0":
                        out = "0";
                        break;
                    case "1,1,1,1,1,1,0,1":
                        out = "0.";
                        break;
                    case "0,1,1,0,0,0,0,0":
                        out = "1";
                        break;
                    case "0,1,1,0,0,0,0,1":
                        out = "1.";
                        break;
                    case "1,1,0,1,1,0,1,0" :
                           out = "2";
                           break; 
                    case "1,1,0,1,1,0,1,1" :
                           out = "2.";
                           break;
                    case "1,1,1,1,0,0,1,0" :
                           out = "3";
                           break;
                    case "1,1,1,1,0,0,1,1" :
                           out = "3.";
                           break;
                    case "0,1,1,0,0,1,1,0" :
                           out = "4";
                           break ; 
                    case "0,1,1,0,0,1,1,1" :
                           out = "4.";
                           break ;
                    case "1,0,1,1,0,1,1,0" :
                           out = "5";
                           break ;
                    case "1,0,1,1,0,1,1,1" :
                           out = "5.";
                           break ;
                     case "1,0,1,1,1,1,1,0" :
                           out = "6";
                           break ; 
                    case "1,0,1,1,1,1,1,1" :
                           out = "6.";
                           break ;
                    case "1,1,1,0,0,0,0,0" :
                           out = "7";
                           break ;
                    case "1,1,1,0,0,0,0,1" :
                           out = "7.";
                           break ;
                    case "1,1,1,1,1,1,1,0" :
                           out = "8";
                           break ;
                    case "1,1,1,1,1,1,1,1" :
                           out = "8.";
                           break ;
                    case "1,1,1,1,0,1,1,0" :
                           out = "9";
                           break ;
                    case "1,1,1,1,0,1,1,1" :
                           out = "9.";
                           break ;       
                    default: break;
                }
            
            if (out!=null) System.out.print(out);
                 else break;
            }
            
            
        }
      
        
    }
    

