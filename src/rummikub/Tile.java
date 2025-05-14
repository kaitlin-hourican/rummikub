package src.rummikub;

public class Tile {

    // instance vars
    int value;      
    Colour colour; 

    // constructors

    /**
     *  default constructor
     */
    public Tile() {
    }

    /**
     * constructor all vars
     * @param value - from 1-13 except for jokers
     * @param colour - enum 
     */
    public Tile(int value, Colour colour) {
        this.value = value;
        this.colour = colour;
    }

    // getters + setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

}
