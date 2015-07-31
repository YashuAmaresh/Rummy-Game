
package card;

import java.util.List;

public class Card {
    String rank;
    String suit;
    
    public Card(String rank, String suit ) {
        this.rank = rank;
        this.suit = suit;
    }
    public Card intToCard(int num ) {
        char suit[] = {'S', 'D', 'H', 'C'};
        return new Card(" ", " ");
    }
    public boolean areInSequence(List<Card> cards) {
        for(int i=1;i<cards.size();i++)
        {
            if(cards.get(i).suit.equals(cards.get(i-1).suit))
            {
                if(cards.get(i).rank-cards.get(i-1).rank!=1)
                {
                    return false;
                }
            }
            else
                return false;
        }
        return true;
    }
    public boolean isTriplet(List<Card> cards) {
       for(int i=1;i<cards.size();i++)
        {
            if(cards.get(i).rank==cards.get(i-1).rank)
            {
                if(cards.get(i).suit.equals(cards.get(i-1).suit))
                    return false;
            }
            else
                return false;
        }
        return true;
    }
    
}
