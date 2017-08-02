/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String name;
            String surname;
            String line;
            int year, month, day, age;
            ArrayList<Person> list = new ArrayList<>();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                line = scanner.nextLine();
                String parts[] = line.split(" ");
                surname = parts[1];
                name = parts[2];
                String part1[] = parts[0].split("-");
                year = Integer.parseInt(part1[0]);
                month = Integer.parseInt(part1[1]);
                day = Integer.parseInt(part1[2]);
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (month == 2 && day == 28) {
                        throw new Exception("Data invalida");
                    }

                }
                if ((year % 4 != 0 && year % 100 == 0) || (year % 400 != 0)) {
                    if (month == 2 && day == 29) {
                        throw new Exception("Data invalida");
                    }
                }
                if (year > 2017 || month > 12 || month < 1 || day < 1) {
                    throw new Exception("Data invalida");
                }
                if ((month == 2 && day == 30) || (month == 2 && day == 31)) {
                    throw new Exception("Data invalida");
                }
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day == 31) {
                        throw new Exception("Data invalida");
                    }
                }

                LocalDate start = LocalDate.of(year, month, day);
                LocalDate end = LocalDate.of(2017, 1, 13);
                long age1 = ChronoUnit.YEARS.between(start, end);
                list.add(new Person((int) age1, name, surname));

            }

            Collections.sort(list, new PersonComparator());
            for (Person p : list) {
                System.out.println(p.varsta + " " + p.prenume + " " + p.nume);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
