
package card;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card {
    int rank;
    String suit;
    final static int deck_size = 53;
    final static int set_size = 13;
    
    static String allSuits[] = {"S", "D", "C", "H"};
    static int allRanks [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    public Card(int rank, String suit ) {
        this.rank = rank;
        this.suit = suit;
    }
    
    public boolean areInSequence(List<Card> cards) {
        return true;
    }
    public boolean haveSameRank(List<Card> cards) {
        return true;
    }
    
    public static void intToCard(int num ) {
        Card card;
        int number;
        int symbol;
        int indexInDeck = num % deck_size;
        if (indexInDeck == 0) {
            card = new Card(14, "");
            System.out.println("rank : 14, suit : No");
        }
        
 
        else {
            number = indexInDeck % set_size;
            symbol = indexInDeck / set_size;
            card = new Card(allRanks[number], allSuits[symbol]);
            System.out.println("rank : " + allRanks[number] + "suit : " + allSuits[symbol]);
        }
 
        
      //  return card;
    }
}
