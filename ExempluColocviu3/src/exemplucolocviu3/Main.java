/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
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
        int n;
        float max, min;
        try {
            n = scanner.nextInt();
            if (n < 1 || n > 500) {
                throw new Exception("Valoare de intrare invalida");
            }
            min = scanner.nextFloat();
            max = scanner.nextFloat();
            if ((min < 0) || (max < 0) || (min > max)) {
                throw new Exception("Valoare de intrare invalida");
            }
            ArrayList<Figure> list = new ArrayList<>();
            Figure figure;
            for (int i = 0; i < n; i++) {
                String forma = scanner.next();
                if (forma.equals("cerc")) {
                    float x = scanner.nextFloat();
                    float y = scanner.nextFloat();
                    if ((x < -1000 || x > 1000) || (y < -1000 || y > 1000)) {
                        throw new Exception("Valoare de intrare invalida");
                    }
                    float radius = scanner.nextFloat();
                    if (radius < 0 || radius > 1000) {
                        throw new Exception("Valoare de intrare invalida");
                    }
                    figure = new Cerc(x, y, radius);
                    list.add(figure);
                }
                if (forma.equals("dreptunghi")) {
                    float x1 = scanner.nextFloat();
                    float y1 = scanner.nextFloat();
                    float x2 = scanner.nextFloat();
                    float y2 = scanner.nextFloat();
                    if ((x1 < -1000 || x1 > 1000) || (y1 < -1000 || y1 > 1000) || (x2 < -1000 || x2 > 1000) || (y2 < -1000 || y2 > 1000)) {
                        throw new Exception("Valoare de intrare invalida");
                    }
                    figure = new Dreptunghi(x2 - x1, y2 - y1);
                    list.add(figure);

                }
                if (forma.equals("patrat")) {
                    float x1 = scanner.nextFloat();
                    float y1 = scanner.nextFloat();
                    float x2 = scanner.nextFloat();
                    float y2 = scanner.nextFloat();
                    if ((x1 < -1000 || x1 > 1000) || (y1 < -1000 || y1 > 1000) || (x2 < -1000 || x2 > 1000) || (y2 < -1000 || y2 > 1000)) {
                        throw new Exception("Valoare de intrare invalida");
                    }
                    figure = new Patrat(x2 - x1);
                    list.add(figure);
                }

            }
            Collections.sort(list, new FigureComparator());
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            for (Figure fig : list) {
                if (fig instanceof Dreptunghi) {
                    System.out.println(((Dreptunghi) fig).form + " " + Math.round(((Dreptunghi) fig).Area * 100) / 100.00 + " " + Math.round(((Dreptunghi) fig).Perimeter * 100) / 100.00);
                }
                if (fig instanceof Cerc) {
                    System.out.println(((Cerc) fig).form + " " + Math.round(((Cerc) fig).area * 100) / 100.00 + " " + Math.round(((Cerc) fig).lungime * 100) / 100.00);
                }
                if (fig instanceof Patrat) {
                    System.out.println(((Patrat) fig).form + " " + Math.round(((Patrat) fig).Area * 100) / 100.00 + " " + Math.round(((Patrat) fig).Perimeter * 100) / 100.00);
                }

            }
            int count = 0;
            for (Figure fig : list) {
                if (fig instanceof Dreptunghi) {
                    if (((Dreptunghi) fig).Area >= min && ((Dreptunghi) fig).Area <= max) {
                        count++;
                    }
                }
                if (fig instanceof Patrat) {
                    if (((Patrat) fig).Area >= min && ((Patrat) fig).Area <= max) {
                        count++;
                    }
                }
                if (fig instanceof Cerc) {
                    if (((Cerc) fig).area >= min && ((Cerc) fig).area <= max) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
