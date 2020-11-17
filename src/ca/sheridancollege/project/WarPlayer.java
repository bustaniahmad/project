package ca.sheridancollege.project;

/**
 * WarPlayer class has player object for WarGame
 * @author AhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */

public class WarPlayer extends Player {
    // Data members
    private boolean hasPlayed;
    private int score = 0;
    private Card card;
    private String nName = "";
   
    public WarPlayer(boolean hasPlayed, int score, Card card, String nName) {
        this.hasPlayed = false;
        this.score = 0;
        this.card = null;
        this.nName = nName;
    }
    
    // Check if player has played
    public boolean hasPlayed() {
        return hasPlayed;
    }
    
    // Set if player has played
    public void setPlayed(boolean played) {
        hasPlayed = played;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int nScore) {
        score = nScore;
    }
    
    public Card getCard() {
        return card;
    }
    
    public void setCard(Card nCard) {
        card = nCard;
    }
    
    /**
     * @return the player name
     */
    public String getName() {
        return nName;
    }

    /**
     * @param nName the player name to set
     */
    public void setName(String nName) {
        this.nName = nName;
    }

}