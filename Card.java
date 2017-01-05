
/**
 * Write a description of class Card here.
 * 
 * @Kaitlyn Sandor 
 * @1/5/17
 */
public class Card
{
   public enum Suit{
       Spades,
       Hearts,
       Clubs,
       Diamonds
    }
   public enum FaceValue{
       Two,
       Three,
       Four,
       Five,
       Six,
       Seven,
       Eight,
       Nine,
       Ten,
       Jack,
       Queen,
       King,
       Ace
    }
   public FaceValue mFaceVal;
   public Suit mSuit;
   public Card(FaceValue faceVal, Suit suit)
   {
      mFaceVal = faceVal;
      mSuit = suit;
   }
   @Override
   public String toString()
   {
       return mFaceVal + " of " + mSuit;
   }
   @Override
   public boolean equals(Object other)
   {
       if(other==null) return false;
       if(!(other instanceof Card))return false;
       if(this == other) return true;
       Card theOther = (Card)other;
       if(theOther.mFaceVal == mFaceVal && theOther.mSuit == mSuit)
       return true;
       else
       return false;
   }
   
}
