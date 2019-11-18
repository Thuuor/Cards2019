
public class Deck {

	private Card[] cards;
	private int numCards;
	public static final int CARDS = 48;
	
	public Deck() {
		numCards = cards.length;
		cards = new Card[CARDS];
		
		for (int i = 0; i < 12;i++) {
			cards[i] = new Card(i + 1, SuitType.OROS);
			cards[i + 12] = new Card(i + 1, SuitType.COPAS);
			cards[i + 24] = new Card(i + 1, SuitType.ESPADAS);
			cards[i + 36] = new Card(i + 1, SuitType.BASTOS);
		}
		
		
	}
	
	public void print() {
		for (int i = 0; i < cards.length;i++) {
			if (i == 12 || i == 24 || i == 36) {
				System.out.println("--------------------------");
			}
			System.out.println(cards[i]);
			
		}
	}
	
	public void shuffle() {
		
		Card temp;
		
		for (int i = 0; i < 1000; i++) {
			int rand1 = (int)(Math.random() * cards.length);
			int rand2 = (int)(Math.random() * cards.length);
			temp = cards[i];
			cards[rand1] = cards[rand2];
			cards[rand2] = temp;
		}
		
	}
	
	public Card extractCard() {
		numCards --;
		return cards[numCards];
	}
}
