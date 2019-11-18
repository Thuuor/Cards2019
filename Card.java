
public class Card {

	private int num;
	private SuitType suit;
	
	public Card(int num, SuitType suit) {
		this.num = num;
		this.suit = suit;
		
	}
	
	@Override
	public String toString() {
		String s = "";
		
			switch (num) {
			case 1:
				s = "As";
				break;
			case 10:
				s = "Sota";
				break;
			case 11:
				s = "Caballo";
				break;
			case 12:
				s = "Rey";
				break;
			default:
				s += num;
			}
			
			switch (suit) {
			case OROS:
				s += " de oros";
				break;
			case COPAS:
				s += " de copas";
				break;
			case ESPADAS:
				s += " de espadas";
				break;
			case BASTOS:
				s += " de bastos";
				break;
			}
			return s;
	}
	
}
