/**
 * Write a description of class Deck here.
 * 
 * @Kaitlyn Sandor
 * @1/5/17
 */
public class Deck
{
    public final int NUMCARDS = 52;
    private int counter = 0;
    public Card[] deck = new Card[NUMCARDS];
    public Deck()
    {
        int counter = 0;
        for(Card.FaceValue x : Card.FaceValue.values())
            for(Card.Suit y : Card.Suit.values())
            {deck[counter] = new Card(x,y);
                counter++;}
    }

    public Card getNextCard()
    {
        if(!hasNext())
                counter = 0;
            counter++;
            return deck[counter-1];
    }

    public void shuffle()
    {
        for(int i = 0; i < deck.length-1; i++)
        {
            int index = (int)(Math.random()*(deck.length-1 - i)+ i);
            Card a = deck[index+1];
            deck[index+1] = deck[i];
            deck[i] = a;
        }
        counter = 0;
    }

    public boolean hasNext()
    {
        if(counter < NUMCARDS)
            return true;
        return false;
    }

    public void dump()
    {
        for(Card x: deck)
            System.out.println(x);
    }
}
