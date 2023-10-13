package blackjack;

import java.util.ArrayList;

public class BlackJack {

    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda) {
        for (Player p : players) { // prohodimsa po vsem igrokam
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p : players) { // prohodimsa po vsem igrokam
            p.addCardToHand(koloda.getRandomCard());
        }

    }
    //metod razdaet karti

    public void dealAllNeedCards(Koloda koloda) {
        for (Player p : players) {
            while (p.needMoreCards()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    public void printWinner() {
        /**
         * 24  26  25  27  - pobedil dealer !!
         * 19  26  26  33  - pobedil u kogo nedobor !!
         * 21  21  21  20 - pobedili 3-e
         * 18  18  12  26 - pobedili 2-e
         * 12  12  13  14 - pobedili 14

         */

        for(Player p:players)

        {// fk=lag false tem kto proigral
            if (p.countBallInHand() > 21) {
                p.setCanWin(false);
            }
        }

        ///esli u vsex perebor
        if(countPlayersWhoCanWin() == 0){
            for(Player p: players){
                if(p instanceof Dealer){
                    System.out.println("Pobedil krupie!!! Ego karti");
                    p.openHand();
                    return;
                }
            }

            int ballWinner = -1;
            for(Player p: players){
                if(p.isCanWin() && p.countBallInHand() > ballWinner){
                    ballWinner = p.countBallInHand();
                }
            }

            // uznali bal pobeditelia i pechataem tex
            for(Player p: players){
                if (p.countBallInHand() == ballWinner) {
                    System.out.println("Pobeditel " + p.getName() + "! Ego kari:");
                }
            }
        }

        // esli v igre ostalsia tolko odin
        if(countPlayersWhoCanWin()== 1){
            for(Player p: players){
                if(p. isCanWin()){
                    System.out.println("Viigral " + p.getName() + " ! Ego karti");
                    p. openHand();
                    return;
                }
            }
        }
    }


    private int countPlayersWhoCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }

}
