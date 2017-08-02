/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

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
        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();
            while (!scanner.hasNextInt()) {
                list.add(scanner.next().toLowerCase());

            }
            int count = 0;
            for (String s : list) {
                count += s.length();
            }
            if (count > 5000) {
                throw new Exception("Date de intrare invalide");
            }
            int no = scanner.nextInt();
            if (no < 1 || no > 10) {
                throw new Exception("Date de intrare invalide");
            }
            String[] cuv = new String[no];
            int counts = 0;
            for (int i = 0; i < no; i++) {
                cuv[i] = scanner.next().toLowerCase();
                if (!cuv[i].matches("[a-z]+")) {
                    throw new Exception("Date de intrare invalide");
                }
            }
            int k = 0;
            int aux = 0;
            String sir[] = new String[list.size()];
            for (String s : list) {
                sir[k] = s;
                k++;
            }
            int n = 0;
            while (n != cuv.length) {
                for (int i = 0; i < sir.length; i++) {
                    if (sir[i].contains(cuv[n])) {
                        String replacement = "";
                        for (int j = 0; j < cuv[n].length(); j++) {
                            replacement += "*";
                        }
                        counts += cuv[n].length();
                        sir[i] = sir[i].replaceAll(cuv[n], replacement);
                        aux++;

                    }

                }

                n++;

            }
            for (int i = 0; i < sir.length; i++) {
                System.out.print(sir[i] + " ");
            }

            System.out.println();
            System.out.println(counts);
            float result = (float) (100 * aux) / list.size();
            System.out.printf("%.2f", result);
            System.out.print("%");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
