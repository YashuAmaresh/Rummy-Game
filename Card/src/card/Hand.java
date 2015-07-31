package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand {
    
    
    List<Card> cardsInHand;
    Dealer dealer = new Dealer();
	
    public Hand() {
        cardsInHand  = new ArrayList<>();
        for(int i=0;i<13;i++)
        {
            Card card = dealer.getCard();
            if(card.isJoker())
            {
                joker = card;
            }
            else
            {
                cardsInHand.add(card);
            }
        }
    }  
    
    public List<Card> sort()
    {
        Collections.sort(cardsInHand);
        return cardsInHand;
        
    }
    

    public void printHand() {
            for (Card card : cardsInHand) {
                    System.out.println(card.rank + " : " + card.rank);
            }
    }
    

    public void necessaryCards() {

    }
}
