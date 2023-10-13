package lesson11;

import lesson12.ReverseNumsComparator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        // prohod po kolekcii
        // 1 - c pomocsy for - ispolzuetca v kollekciah gde est indeksi
        // 2 - c pom for each - mogno proitis po kolleciam no ne izmenit ee
        // 3 - c pom iteratora - moget proitis i izmenit kolleciy
        TreeSet<Integer> texts = new TreeSet<>(new ReverseNumsComparator());
        texts.add(8);
        texts.add(44);
        texts.add(5);
        texts.add(44);
        texts.add(33);
        texts.add(138);
        texts.add(6);


        for(Iterator<Integer> iterator = texts.iterator();iterator.hasNext();  ){
            System.out.println(iterator.next());
        }

    }
}
