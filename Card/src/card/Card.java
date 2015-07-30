
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
        return true;
    }
    public boolean haveSameRank(List<Card> cards) {
        return true;
    }
    
}
