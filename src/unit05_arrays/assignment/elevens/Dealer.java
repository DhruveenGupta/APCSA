package unit05_arrays.assignment.elevens;

public class Dealer extends Player
{
    private Deck deck;

	public Dealer() {
		deck = new Deck();
		shuffle();
	}

	public void shuffle()
	{
		if (deck == null) {
			deck = new Deck();
		}
		deck.shuffle();
	}

	public Card deal(){
		if (deck == null || deck.numCardsLeft() == 0) {
			return null;
		}
		return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck == null ? 0 : deck.numCardsLeft();
	}

	public boolean hit()
	{
		return getHandValue() < 17;
    }
}

