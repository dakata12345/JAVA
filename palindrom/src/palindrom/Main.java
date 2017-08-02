/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

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
        /*int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        number = scanner.nextInt();
        Palindrom palindrom = new Palindrom();
        if (palindrom.getInvers(number) == number){
                System.out.println("Numarul este palindrom");
        } else {
            System.out.println("Numbarul nu este palindrom");
        }
        
    }
    */
    /*int n;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    int [] v1 = new int[n];
    int [] v2 = new int[n];
    for (int i = 0 ; i < n ; i++){
        v1[i] = scanner.nextInt();
    }
    for (int i = 0 ; i < n ; i++){
        v2[i] = scanner.nextInt();
    }
    
    
    for (int i = 0 ; i < n ; i++){
        System.out.print(v1[i] + " ");
    }
    
    for (int i = 0 ; i < n ; i++){
        System.out.print(v2[i] + " ");
    }
    
     int contor = 0;
     int [] v3 = new int[100];
     for (int i = 0 ; i<n;i++){
         for (int j = 0; j<n;j++){
         if (v1[i] == v2[j]){
             v3[contor] = v1[i];
             contor++;
         }
    }
         }
        System.out.println("");
    for (int i = 0 ; i < contor ;i++){
        System.out.print(v3[i] + " ");
    }
     if (contor == 0){
         System.out.println("Vectorii nu se intersecteaza");
     }
*/
        /*int n,z,k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui n :");
        n = scanner.nextInt();
        System.out.println("Introduceti valoarea lui z");
        z = scanner.nextInt();
        System.out.println("Introduceti valoarea lui k");
        k = scanner.nextInt();
        System.out.println("Introduceti vectorul");
        int []v = new int[n+1];
        for (int i = 0 ; i < n ; i++){
            v[i] = scanner.nextInt();
        }
        System.out.println("Vectorul inainte de introducere");
          for (int i = 0 ; i < n ; i++){
              System.out.print(v[i] + " ");
        }
          for (int i = n  ; i>=k;i--){
              v[i] = v[i-1];
          }
          v[k] = z;
           System.out.println("Vectorul dupa introducere");
          for (int i = 0 ; i <= n ; i++){
              System.out.print(v[i] + " ");
        }
*/
       /*  int n;
         Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         int [][] mat = new int[n][n];
         for (int i = 0 ; i < n ; i++){
             for (int j = 0 ; j < n ; j++){
                    if (i == j){
                        mat[i][j] = 1;
                    } else{
                        mat[i][j] = 0;
                    }
             }
         }
         
         for (int i = 0 ; i < n ; i++){
             for (int j = 0 ; j < n ; j++){
                 System.out.print(mat[i][j] + " ");
             }
             System.out.println();
         }
         */
      /* int n;
       Scanner scanner = new Scanner(System.in);
       n = scanner.nextInt();
       int [][] mat = new int[n][n];
       int data;
       for (int i = 0 ; i < n ;i++){
           for (int j = 0 ; j<n;j++){
               data = scanner.nextInt();
               if ((data >= 0) && (data <=9)){
                   mat[i][j] = data;
               } else{
                   System.out.println("Introduceti doar elemente de la 0-9");
                  mat[i][j] = scanner.nextInt();
               }
               
       }
       }
        for (int i = 0 ; i < n ;i++){
           for (int j = 0 ; j<n;j++){
               if (i < j){
                   System.out.print(mat[i][j] + " ");
               }
               
           }
            System.out.println();
        }
          */
          
     // MATRIX PRODUCT
    /*  int m,n,p,q;
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
      m = scanner.nextInt();
      p  =scanner.nextInt();
      q = scanner.nextInt();
      
      boolean ok = false;
      while(!ok){
        if (n!=p){
            System.out.println("Matrice au oridinile diferite => nu pot fi inmultite");
            System.out.println("Introduceti alte valori pentru n sau p");
            
            if(scanner.next().equals("p")){
                p = scanner.nextInt();
                if (p == n) ok = true;
            } else if (scanner.nextLine().equals("n")){
                    n = scanner.nextInt();
                    if (n==p) ok = true;
                }
                     else  {
                            System.out.println("Va rog alegeti ce valoare doriti sa schimbati");
                           }
        } else{
            ok = true;
            System.out.println("Valorile pentru n si p sunt " + n + " " + p);
        }
      }
      int [][] a = new int[n][m];
      int [][] b = new int[p][q];
      int [][] c = new int[n][m];
      
      for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < m ; j++){
              a[i][j] = scanner.nextInt();
          }
      }
      for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < m ; j++){
              b[i][j] = scanner.nextInt();
          }
      }
      int sum = 0;
      for (int i = 0 ; i < n ; i++){
          for (int j = 0 ; j < q ; j++){
              for (int k = 0 ; k < p ; k++){
                  sum += a[i][k] * b[k][j];
              }
              c[i][j] = sum;
              sum = 0;
          }
      }
       for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < m ; j++){
              System.out.print(a[i][j] + " ");
          }
          System.out.println();
      }
        System.out.println();
         for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < m ; j++){
              System.out.print(b[i][j] + " ");
          }
          System.out.println();
      }
         System.out.println();
      for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < m ; j++){
              System.out.print(c[i][j] + " ");
          }
          System.out.println();
      }
*/
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int [][] a = new int[n][n];
         for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n ; j++){
              if (i == j){
                  a[i][j] = 0;
              } else if (i<j)  {
                  a[i][j] = j-i;
                  
              } else if (i>j){
                  a[i][j] = i-j ;
                  
              }
                  
          }
           
      }
          for (int i = 0 ; i < n; i++){
          for (int j = 0 ; j < n ; j++){
              System.out.print(a[i][j] + " ");
          }
          System.out.println();
      }
*/
      /* Scanner scanner = new Scanner(System.in);
       String cuv = scanner.nextLine();
       String vocale = "a,e,i,o,u";
       char [] cuv_2 ;
       char [] vocal ;
       vocal = vocale.toCharArray();
       cuv_2 = cuv.toCharArray();
       for (int k = 0 ; k < vocal.length;k++){
         for (int i = 0 ; i < cuv_2.length;i++){
           if (cuv_2[i] == vocal[k]){
               cuv_2[i] = '_';
           }
       }
       }
       for (int i = 0 ; i < cuv_2.length;i++){
           System.out.print(cuv_2[i]);
       }
       // result = cuv.replaceAll("[a,e,i,o,u],"_");
      */
      /*Scanner scanner = new Scanner(System.in);
      int n,m;
      n = scanner.nextInt();
      m = scanner.nextInt();
      int [][] mat = new int[n][n];
      int product=1 , count = 0,min1 = 2147483647,min2 = 2147483647  ;
      for (int i = 0 ; i < n ; i++){
          for (int j = 0 ; j < m ; j++){
             mat[i][j] = scanner.nextInt();
          }
          
      }
      for (int i = 0 ; i < n ; i++){
          for (int j = 0 ; j < n ; j++){
            if (i == j) {
                count += mat[i][j];
            }
            if ((i == n-j - 1)){
                   product *=mat[i][j]; 
                    }
             if (i<j){
                    if (mat[i][j] < min1){
                    min1 = mat[i][j];
                }
                
            }
            if (i > j){
                if (mat[i][j] < min2){
                     min2 = mat[i][j];                   
                }
            }
            
        }
         
      }
      int sum_margin = 0;
      for (int i = 0 ; i < n ; i++){
          sum_margin += mat[i][0] + mat[i][m-1];
      }
    
      System.out.println("Produsul e " + product);
      System.out.println("Suma pe diagonala principala e " + count);
      System.out.println("Minimul elementelor de deasupra diagonalei principale " + min1);
      System.out.println("Minimul elementelor de sub diagonala principala " + min2);
      System.out.println("Suma elementelor de marginea matricei este  " + sum_margin);
      
      */
     /* int n,m;
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
      m = scanner.nextInt();
      int [][] mat_2 = new int [n][m];
      int suma = 0;
      for (int i = 0 ; i < n;i++){
          for (int j = 0 ; j < m ; j++){
              mat_2[i][j] = suma + 1;
              suma++;
          }
          suma = i + 1;
      }
      
      
      for (int i = 0 ; i < n ; i++){
          for (int j = 0 ; j < m ; j++){
             System.out.print(mat_2[i][j] + " ");
          }
          System.out.println("");
          
      }
*/
    /* String s;
     Scanner scanner = new Scanner(System.in);
     s = scanner.nextLine();
     returnChar(s);
     
    
  

}
     public static void returnChar(String s){
         if (s.length() > 1){
         String string1 = s.substring(1, s.length());
         System.out.println(string1);
         String string2 = string1.substring(0,string1.length()-1);
         System.out.println(string2);
         if ((string2.length() !=1) && (!string2.matches(""))){
             returnChar(string2);
         }
     }
      */
      /* Scanner scanner = new Scanner(System.in);
       float a,b,c;
       System.out.println("Introduceti valorile pentru a ,b,c");
       System.out.print("a = " + "\n");
       a = scanner.nextInt();
       System.out.print("b = " + "\n");
       b = scanner.nextInt();
       System.out.print("c = " + "\n");
       c = scanner.nextInt();
       float delta = b*b -(4*a*c);
       if (delta < 0){
           System.out.println("Ecuatia "+ a + "x*x + " + b +"x" +" + "+ c + " " +"nu are solutii reale");
           System.out.println("x1 = " +  (-b/2*a) + " + i *" + (Math.sqrt(-delta) / 2*a));
           System.out.println("x2 = " +  (-b/2*a) + " - i *" + (Math.sqrt(-delta)/2*a));
       } else{
           System.out.println("x1 = " +  (-b/2*a)  +" + " + (Math.sqrt(delta) / 2*a));
           System.out.println("x2 = " +  (-b/2*a) + " - " + (Math.sqrt(delta)/2*a));
       }
     }
     */
   /* Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String [] data = s.split("[.]");
    boolean ok = false;
    int day = Integer.parseInt(data[0]);
    int month = Integer.parseInt(data[1]);
    int year = Integer.parseInt(data[2]);
    if ((day > 0) && (day <=31)){
        if ((month > 0) && (month <=12)){
            if ((year > 0) && (year < 10000)){
                ok = true;
            }
        }
    }
    if (ok){
        System.out.println("Valoarea introdusa poate fi o data calendaristica");
    } else{
        System.out.println("Valoarea introdusa nu e o data calendaristica");
    }
    */
     /*  Scanner scanner = new Scanner(System.in);
       boolean ok = true;
       while(ok){
       System.out.println("Introduceti valorile lui a si b");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       System.out.println("Alegeti operatia dorita * / - +");
       char c = scanner.next().charAt(0);
       switch(c){
           case '-' : System.out.println(a-b);
                      break;
           case '+' : System.out.println(a+b);
                      break;
           case '*' : System.out.println(a*b);
                      break;
           case '/' : if (b!=0){
                        System.out.println(a/b);
                        break;
           } else{
               System.out.println("Nu se poate efectua impartirea");
               break;
           }
           case 'q' : ok = false;
                      break;
       }
    
       }
*/
   /*  Scanner scanner = new Scanner(System.in);
     System.out.println("Introduceti raza");
     int raza = scanner.nextInt();
     System.out.println("Alegeti optiunea A - arie , L-lungime , q-iesire");
     String s = scanner.next();
     char c = s.charAt(0);
    switch(c){
        case 'A' : System.out.println("Aria este " + raza*raza*3.14);
                    break;
        case 'L' : System.out.println("Lungimea este " + 2*raza*3.14);
                   break; 
        case 'q' : System.out.println("Iesire");
                   break;
        default : System.out.println("Va rugam alegeti o optiune"); 
                  break;
    }
*/  
  /* Scanner scanner = new Scanner(System.in);
   int  a = scanner.nextInt();
   int b = 2*a;
   do{
       System.out.println(a + " * " + a + " = " + a*a);
       a++;
   }while(a<=b);
*/
    /*Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    int sum2 = 0;
    sum2 = (n*(n+1)) / 2;
    for (int i = 1 ; i <=n ; i++){
        sum+=i;
    }
    System.out.println(sum2);
    System.out.println(sum);
     */
    
    
   /* Scanner scanner = new Scanner(System.in);
    int a  = scanner.nextInt();
    int b = scanner.nextInt();
    if (a<=b){
    int aux = a;
    int i = b;
    System.out.println("Numerele din intervalul " +"[" + a + "," + b + "]" + " in ordine crescatoare sunt : ");
    while(aux<=b){
        System.out.printf("%d ",aux);
        aux++;
    }
    System.out.println();
    System.out.println("Numerele din intervalul " +"[" + a + "," + b + "]" + "in ordine descrescatoare sunt : ");
    while(i>=a){
        System.out.printf("%d ",i);
        i--;
    }
    System.out.println();
    System.out.printf("Media aritmetica este %.2f \n",(float)(a+b)/2);
    } else{
        System.out.println("Va rugam sa introduceti a < b");
    }   
    */
 /*   Scanner scanner = new Scanner(System.in);
    int a  = scanner.nextInt();
    int b = scanner.nextInt();
    int k = 0;
    if (a<=b){
    int aux = a;
    boolean ok =  true;
    System.out.println("Numerele prime din intervalul " +"[" + a + "," + b + "]" + " sunt : ");
    if (a < b){
    while(aux<=b){
         
        for (int j = 2 ; j <aux;j++ ){
            if ((aux % j == 0) && (aux !=2)){
                ok = false;
            } 
        }
        if ((aux == 0) || (aux == 1)){
            ok = false;
        }
        if (ok){
            System.out.printf("%d ",aux);
            k = 1;
        }
        ok = true;
        aux++;
        
        }
    
    }  
    
    }else{
        System.out.println("Va rugam sa introduceti a < b");
    } 
    
    if (k == 0 ){
        System.out.println("Nu sunt numere prime in intervalul dat");
    }

 */
   /* Scanner scanner = new Scanner(System.in);
    int a  = scanner.nextInt();
    int b = scanner.nextInt();
    int k = 0;
    for (int i = a; i <=b;i++){
        for (int j = 2 ; j <=i;j++){
            if ((i%j == 0) && (i!=j)){
                k = 1;
            }
        }
        if ((i == 0) || (i == 1)){
        k =1;
    }
        if (k == 0){
            System.out.printf("%d ",i);
        }
        k = 0;
    }
    if (k==1){
        System.out.println("Nu exista nr prime in intervalul dat");
    }
*/
    
    Scanner scanner = new Scanner(System.in);
    
    
    
    }
    

}
