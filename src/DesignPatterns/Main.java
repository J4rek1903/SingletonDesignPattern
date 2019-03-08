package DesignPatterns;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();

       /* //player1
        Singleton player1 = Singleton.getInstance();

        System.out.println(System.identityHashCode(player1));

        System.out.println(player1.getLetterList());

        LinkedList<String> playerOneTiles = player1.getTiles(8);

        System.out.println("Player1 Tiles: "+playerOneTiles);

        System.out.println(player1.getLetterList());

        //player2
        Singleton player2 = Singleton.getInstance();

        System.out.println(System.identityHashCode(player2));

        System.out.println(player2.getLetterList());

        LinkedList<String> playerTwoTiles = player2.getTiles(5);

        System.out.println("Player2 Tiles: "+playerTwoTiles);

        System.out.println(player2.getLetterList());*/

    }
}
