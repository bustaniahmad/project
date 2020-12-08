package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Haki Sharifi
 * @modifier AhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */

public abstract class Player 
{
    protected String name; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String nName)
    {
        name = nName;
    }
    
    /**
     * @return the playerID
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setName(String givenID) 
    {
        name = givenID;
    }    
}
