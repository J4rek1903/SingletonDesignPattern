package DesignPatterns;

import java.util.LinkedList;


public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton game = Singleton.getInstance();
        int gameID = System.identityHashCode(game);
        System.out.println("\n"+game.getLetterList()+"\n");
        LinkedList<String> playerTiles = game.getTiles(7);
        System.out.println("game "+gameID+" tiles : "+playerTiles);
        System.out.println("Tiles left: "+game.getLetterList());
    }
}
