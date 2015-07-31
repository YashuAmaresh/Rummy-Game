package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Hand {
    
    List<Card> cardsInHand;
    Dealer dealer = new Dealer();
    Card joker;
    public Hand() {
        cardsInHand  = new ArrayList<>();
//        for(int i=0;i<13;i++)
//        {
//            Card card = dealer.getCard();
//            if(card.isJoker())
//            {
//                System.out.println("JOKER");
//                joker = card;
//            }
//            else
//            {
//                cardsInHand.add(card);
//            }
//        }
        cardsInHand.add(new Card(6, "D"));
        cardsInHand.add(new Card(7, "C"));
        cardsInHand.add(new Card(2, "D"));
        cardsInHand.add(new Card(7, "H"));
        cardsInHand.add(new Card(8, "C"));
        cardsInHand.add(new Card(8, "D"));
        cardsInHand.add(new Card(9, "C"));
        cardsInHand.add(new Card(10, "H"));
        cardsInHand.add(new Card(7, "S"));
        cardsInHand.add(new Card(3, "D"));
        cardsInHand.add(new Card(4, "D"));
        cardsInHand.add(new Card(2, "C"));
        cardsInHand.add(new Card(8, "S"));
        
    }
    
    	
      
    
//    public List<Card> sort()
//    {
//        
//        printHand();
//        return cardsInHand;
//        
//    }
    

    public void printHand(List<Card> cards) {
        for (Card card : cards) {
                System.out.print(card.rank + " : " + card.suit+"\t");
        }
        System.out.println();
    }

    public int getMinCardsForSet() {
        int numTriplets = 0;
        int numSeq = 0;
        List<Card> cardsToFindSameRanks = cardsInHand;
        Collections.sort(cardsToFindSameRanks, new RankSortCompare());
        Collections.sort(cardsToFindSameRanks, new sameRankSuitSortCompare());
        List<Card> triplets = new ArrayList<>();
        List<Card> seq = new ArrayList<>();
        for( int i = 0; i < cardsToFindSameRanks.size() - 2; i++) { 
            if ( cardsToFindSameRanks.get(i).isTriplet(cardsToFindSameRanks.subList(i, i+3)) ) {
                triplets.addAll(cardsToFindSameRanks.subList(i, i + 3));
                triplets.add(new Card(15, " "));
            }
        }
        for ( Card c : triplets) {
            if ( c.rank != 15 ) {
                System.out.print(c.rank + " : " + c.suit + "\t");
            }
            else {
                numTriplets += 1;
                System.out.println();
            }
        }
        
        
        List<Card> cardsToFindSequence = cardsInHand;
        Collections.sort(cardsToFindSequence, new SuitSortCompare());
        Collections.sort(cardsToFindSequence, new sameSuitRankSortCompare());
        for( int i = 0; i < cardsToFindSequence.size() - 2; i++) { 
            if ( cardsToFindSequence.get(i).areInSequence(cardsToFindSequence.subList(i, i+3)) ) {
                seq.addAll(cardsToFindSequence.subList(i, i + 3));
                seq.add(new Card(15, " "));
            }
        }
        for ( Card c : seq) {
            if ( c.rank != 15 ) {
                System.out.print(c.rank + " : " + c.suit + "\t");
            }
            else {
                numSeq += 1;
                System.out.println();
            }
        }
        List<Card> toRemove;
        if ( numSeq > numTriplets ) {
            toRemove = seq;
        }
        else {
            toRemove = triplets;
        }
        cardsInHand.removeAll(toRemove);
        
        printHand(cardsInHand);
        return 1;
    }

    private static class RankSortCompare implements Comparator<Card> {


        @Override
        public int compare(Card a, Card b) {
            return a.rank - b.rank;
        }
    }
    private static class SuitSortCompare implements Comparator<Card> {


        @Override
        public int compare(Card a, Card b) {
            return a.suit.compareTo(b.suit);
        }
    }
    private static class sameRankSuitSortCompare implements Comparator<Card> {
        @Override
        public int compare(Card a, Card b) {
            if ( a.rank == b.rank) {
                return a.suit.compareTo(b.suit);
            }
            return 0;
        }
    }
    private static class sameSuitRankSortCompare implements Comparator<Card> {
        @Override
        public int compare(Card a, Card b) {
            if ( a.suit.equals(b.suit)) {
                return a.rank - b.rank;
            }
            return 0;
        }
    }
}
