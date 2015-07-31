package card;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Card implements Comparable<Card> {
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
    public boolean isJoker() {
        return this.rank == 14 && "".equals(this.suit);
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

    @Override
    public int compareTo(Card o) {
        // rank sort
        return 1;
    }

    static class CardComparator {

        public int compare(Card c1, Card c2)
        {
            // suit sort
            return 1;
        }
    }
    
}

