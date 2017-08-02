/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma_caractere;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
        s = s.toLowerCase().trim();
        Map<String,Integer> map = new TreeMap<>();
        String [] s1 = s.split(" ");
        int k = 1;
        for (String s11 : s1) {
            
            if(!s11.matches("")){
            if (!map.containsKey(s11)) {
                   map.put(s11, k);
               } else {
                   k = map.get(s11);
                   k++;
                   map.put(s11, k);
                   k = 1;
               }
            
        } else{
                continue;
            }
        }
        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator <Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> t, Map.Entry<String, Integer> t1) {
               if (t.getValue() > t1.getValue()){
                   return -1;
               } else if (t.getValue() < t1.getValue()){
                   return 1;
               }
               return 0;
            }
        });
    Map<String, Integer> result = new LinkedHashMap<>();
    for (Map.Entry<String,Integer> entry : list)
    {
        result.put( entry.getKey(), entry.getValue() );
    }
    
        for (Map.Entry entry : result.entrySet()) {
     System.out.println(entry.getKey() + " " + entry.getValue());
    }
    }
    
}
