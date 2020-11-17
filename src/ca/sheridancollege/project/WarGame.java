package ca.sheridancollege.project;

/**
 * WarGame Super class defines Game of War
 * WarGame class is abstract to implement public methods like play()
 * @author AhmadBustani
 * @modifier JaykumarChaudhari
 * @modifier ElmerAlmeida
 * @modifier JeremiahTorralba
 */
public abstract class WarGame extends Game {
    //protected data fields accessible to subclasses
    private String GameName = "War";
    protected WarPlayer Player1;
    protected WarPlayer Player2;
    protected boolean inPlay;
    protected Deck deck;
    protected String scorecard;
    protected int stake;
    
    //Create a War game constructor
    public WarGame(String GameName, WarPlayer nPlayer1, WarPlayer nPlayer2, boolean inPlay, Deck deck, String scorecard, int stake) {   
        this.GameName = GameName;
        this.Player1 = nPlayer1;
        this.Player2 = nPlayer2;
        this.inPlay = false;
        this.deck = null;
        this.scorecard = "";
        this.stake = 0;       
    }
   
    // setup() War game method
    public abstract void setup();
    /**
    * Play the game. This might be one method or many method calls depending on your game.
    * play() moved from Player class
    */
    public abstract void play();
    
    // Name of Game access
    public String getGameName() {
        return GameName;
    }
    
    // Player 1 access
    public WarPlayer getPlayer1() {
        return Player1;
    }
    
    // Player 1 set
    public void setPlayer1(WarPlayer p1) {
        Player1 = p1;
    }
    
    // Player 2 access
    public WarPlayer getPlayer2() {
        return Player2;
    }
    
    // Player 2 set
    public void setPlayer2(WarPlayer p2) {
        Player2 = p2;
    }
    
    // Check if Game is in play status
    public boolean inPlay() {
        return inPlay;
    }
    
    // Set Game in play status
    public void setInPlay(boolean play) {
        inPlay = play;
    }
    
    // War match situation where cards are the same hierarchy in War Game
    public abstract void warMatch();
        
}