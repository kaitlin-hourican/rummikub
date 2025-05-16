package src.rummikub;

import java.util.ArrayList;

public class Game {

    // list contains players - maybe change to array for fixed length
    ArrayList<Player> players = new ArrayList<>();



    public static void startGame() {
        printRules();
    }



    private static void printRules() {
        System.out.println("Rummikub Rules"); 
        System.out.println("How To Play\n1. Players make melds (a set of tiles) which must be:\n\t- 3 or more tiles\n\t- a run (set of the same colour in consecutive numerical order, e.g. 3-4-5-6) or a group (set of 3-4 tiles of the same number but different colours, e.g. red 8-blue 8-yellow 8)\nTo get out onto the table, the players first meld/s must be worth at least 30 points\nAfter, players can add or maipulate the tiles already on the table.\nThe jokers' value can replace any tile, taking its value\n\nHow to Win\nThe first player to empty their rack wins\nRemaining tiles in other players' racks are counted to give their score");
    }

}
