package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;

    private ArrayList<Card> cardsInHand = new ArrayList<>();

    private boolean canWin = true;

    public String getName() {
        return name;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCardToHand(Card card){
        cardsInHand.add(card);

    }

    public boolean needMoreCards(){
        System.out.println("---- your cards, " + name);
        openHand();
        System.out.println("--- need more cards? ----");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equalsIgnoreCase("Yes")){
            return true;
        }
        return false;

    }

    public  void openHand(){
        for (Card c: cardsInHand){
            System.out.println(c.getNominal());
        }
    }

    public int countBallInHand(){
        int count = 0;
        for (Card c: cardsInHand){
            count = count + c.getBall();
        }
        return count;
    }



}
