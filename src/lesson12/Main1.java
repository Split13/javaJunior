package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(!o1.getMetall().equals(o2.getMetall())){
                    return o1.getMetall().compareTo(o2.getMetall());
                }

                if(o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                if(o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() -o2.getNominal();
                }

                if(o1.getDiametr() != o2.getDiametr()){
                    return Double.compare(o1.getDiametr(), o2.getDiametr());
                }

                return 0;
            }
        });
        coins.add(new Coin(2.2, "Золото", 5, 1700));
        coins.add(new Coin(2.6, "Silver", 10, 1550));
        coins.add(new Coin(2.3, "Серебро", 11, 1970));
        coins.add(new Coin(2.1, "Золото", 10, 1290));
        coins.add(new Coin(3.5, "Серебро", 5, 1219));
        for (Coin c: coins){
            System.out.println(c);
        }
    }
}
