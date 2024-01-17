

/*Use inheritance and classes to represent a deck of playing cards. Create a Card class 
that stores the suit (e.g., Clubs, Diamonds, Hearts, Spades) and name (e.g., Ace, 2, 
10, Jack) of each card along with appropriate accessors, constructors, and mutators.

 Next, create a Deck class that stores an ArrayList of Card objects. The default 
constructor should create objects that represent the standard 52 cards and store 
them in the ArrayList. The Deck class should have methods to do the following:
• Print every card in the deck.
• Shuffle the cards in the deck. You can implement this by randomly swapping 
every card in the deck.
• Add a new card to the deck. This method should take a Card object as a parameter and add it to the ArrayList.
• Remove a card from the deck. This removes the first card stored in the ArrayList
and returns it.
• Sort the cards in the deck ordered by name.

 Next, create a Hand class that represents the cards in a hand. Hand should be derived from Deck. This is because a hand is like a more specialized version of a deck; 
we can print, shuffle, add, remove, and sort cards in a hand just like cards in a deck. 
The default constructor should set the hand to an empty set of cards.
 Finally, write a main method that creates a deck of cards, shuffles the deck, and 
creates two hands of 5 cards each. The cards should be removed from the deck and 
added to the hand. Test the sort and print functions for the hands and the deck. 
Finally, return the cards in the hand to the deck and test to ensure that the cards 
have been properly returned.
 You may add additional methods or class variables as desired to implement your 
solution. */



public class Main {

    public static void main(String[] args) {

        Deck mydeck = new Deck();
        Hands myHand = new Hands();
        mydeck.sortByName();

        myHand.displayItems();


    }
}

