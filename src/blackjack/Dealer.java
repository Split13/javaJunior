package blackjack;

public class Dealer extends Player {

    // pereopredelenie metoda( perepesivanie rod metods)

    @Override
    public boolean needMoreCards() {
        if(countBallInHand() < 18){
            return true;
        }
        return false;
    }
}
