package card;


import java.util.ArrayList;
import java.util.Collections;


public class Dealer {

	ArrayList<Integer> deck = new ArrayList<>();
	final static int deck_size = 52;
    final static int set_size = 13;
    
    static String allSuits[] = {"S", "D", "C", "H"};
    static int allRanks [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    
    int currentIndex = 0;
    
	public Dealer() {
		for (int i = 0; i < 159; ++i) {
			deck.add(i+1);
		}
		Collections.shuffle(deck);
	}
	public Card getCard()
    {
        Card card;
        int number;
        int symbol;
        int num;
        num = deck.get(currentIndex);
        int indexInDeck =  num % deck_size;
        if (indexInDeck == 0 && num != 0) {
            card = new Card(14, "");
            System.out.println("rank : " + card.rank + ", suit : No");
        }
        
 
        else {
            number = indexInDeck % set_size;
            symbol = indexInDeck / set_size;
            card = new Card(allRanks[number], allSuits[symbol]);
            System.out.println("rank : " + card.rank + ", suit : " + card.suit);
        }
 
        currentIndex++;
        return card;
    }
}
