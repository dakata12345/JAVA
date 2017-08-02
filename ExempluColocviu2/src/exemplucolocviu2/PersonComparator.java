/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplucolocviu2;

import java.util.Comparator;

/**
 *
 * @author IONESCU
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.varsta < o2.varsta) {
            return -1;
        }
        if (o1.varsta > o2.varsta) {
            return 1;
        }
        if (o1.nume.compareTo(o2.nume) == 0) {
            return o1.prenume.compareTo(o2.prenume);
        }
        return o1.nume.compareTo(o2.nume);

    }

}
