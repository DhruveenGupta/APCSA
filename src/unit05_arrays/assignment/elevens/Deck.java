package unit05_arrays.assignment.elevens;

import java.util.ArrayList;


public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		stackOfCards = new ArrayList<Card>();
		topCardIndex = NUMCARDS - 1;

		//loop through suits
			//loop through faces
				//add in a new card
        for (int suit = 0; suit < NUMSUITS; suit++) {
            for (int face = 0; face < NUMFACES; face++) {
                stackOfCards.add(new Card(face, SUITS[suit]));
            }
        }
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
		//reset variables as needed
        for (int i = 0; i < NUMCARDS; i++) {
            int randIndex = (int)(Math.random() * NUMCARDS);
            Card temp = stackOfCards.get(i);
            stackOfCards.set(i, stackOfCards.get(randIndex));
            stackOfCards.set(randIndex, temp);
        }
        topCardIndex = NUMCARDS - 1;
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
	}

	public int numCardsLeft()
	{
		return topCardIndex + 1;
	}

	public Card nextCard()
	{
		return stackOfCards.get(topCardIndex--);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}
