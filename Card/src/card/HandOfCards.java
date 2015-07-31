import java.util.*;


public class HandOfCards {
	
	Card cardsInHand[] = new Card[14];
	ArrayList<Integer> deck = new ArrayList<>();
	
	public HandOfCards() {
		for (int i = 1; i <= 159; ++i) {
			deck.add(i);
		}
		Collections.shuffle(deck);
		
		for (int i = 1; i <= 13; ++i) {
			cardsInHand[i] = new Card(deck.get(i));
		}
		
		printHand();
		
	}
	
	public void printHand() {
		for (Card card : cardsInHand) {
			System.out.println(card.rank + " : " + card.rank);
		}
	}
	public void pickCards() {
		
	}
	
	public void necessaryCards() {
		
	}
}
