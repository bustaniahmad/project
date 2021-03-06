package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
  * @author Haki Sharifi
 * @modifier AhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */

public class Card {
    private int value;
    private Suits suit;
    
    //constructor to create a card with given suit and value
    Card(int cValue, Suits cSuit) {
         suit = cSuit;
         value = cValue;
     }
    
    //Overriding the toString method to print card type in format ex. "Ace of Spades"
    @Override
    public String toString(){
        String name;
        
        //switch case value of card
        switch(value) {
            case 1:
                name = "Ace";
                break;
            
            case 11:
                name = "Jack";
                break;
            
            case 12:
                name = "Queen";
                break;
                
            case 13:
                name = "King";
                break;
                
            default:
                //for values above 13 (king) and between 2 and 10 where value name is integer to string
                name = new Integer(value).toString();
                break;
        }
        
        //add " of <suit>" to the end of the name
        name = name.concat(" of " + suit.toString());       
        
        return name;
    }
    
    //accessors and mutators;
    public int getValue() {
        return value;
    }
    
    public void setValue(int cardValue) {
       value = cardValue;
    }
    
    public Suits getSuit (){
        return suit;
    }    
       
    public int compareTo(Card card2) {
        //convert values to Integers to use compareTo method
        Integer a = value;
        Integer b = card2.getValue();
        
        return a.compareTo(b);
    }
}
