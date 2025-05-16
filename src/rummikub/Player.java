package src.rummikub;

// imports 
import java.util.ArrayList;

public class Player {

    // instance vars
    String name;
    ArrayList<Tile> playerTiles = new ArrayList<>();
    
    // constructors

    /**
     * default constructor
     */
    public Player() {
    }

    /**
     * constructor with all vars
     * @param name
     * @param playerTiles
     */
    public Player(String name, ArrayList<Tile> playerTiles) {
        this.name = name;
        this.playerTiles = playerTiles;
    }

    // getters + setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tile> getPlayerTiles() {
        return playerTiles;
    }

    public void setPlayerTiles(ArrayList<Tile> playerTiles) {
        this.playerTiles = playerTiles;
    }


}
