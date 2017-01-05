
/**
 * Write a description of class Deck here.
 * 
 * @Kaitlyn Sandor
 * @1/5/17
 */
public class Deck
{
    private final int NUMCARDS = 52;
    private Card[] deck = new Card[NUMCARDS];
    public Deck()
    {
        for(int i =0; i < NUMCARDS; i++)
        {
            for(Card.FaceValue x : Card.FaceValue.values())
                for(Card.Suit y : Card.Suit.values())
                    deck[i] = new Card(x,y);
        }
    }

    public Card getNextCard()
    {
        return deck[0];
    }

    public void shuffle()
    {
        for(int i = deck.length -1; i > 0; i--)
        {
            int index = (int)Math.random()*NUMCARDS;
            Card a = deck[index];
            deck[index] = deck[index+1];
            deck[index+1] = a;
        }
        public boolean hasNext()
        {
        }
        public void dump()
        {
        }
    }
