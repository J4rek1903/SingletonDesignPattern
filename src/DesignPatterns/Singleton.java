package DesignPatterns;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    private static Singleton firstInstance = null;

    String [] scrabbleLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U",
            "V","W","Y","X","Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U",
            "V","W","Y","X","Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U",
            "V","W","Y","X","Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","R","S","T","U",
            "V","W","Y","X","Z"};

    LinkedList<String> listOfLetters = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    private Singleton(){}

    static boolean firstThread = true;

    public static Singleton getInstance(){
        if(firstInstance==null) {
            if (firstThread == true) {
                firstThread = false;

                try {
                    Thread.currentThread();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Singleton.class) {
            if(firstInstance==null){
                firstInstance = new Singleton();
                Collections.shuffle(firstInstance.listOfLetters);
            }


            }
        }

        return firstInstance;

    }

    public LinkedList<String> getLetterList(){
        return firstInstance.listOfLetters;
    }

    public LinkedList<String> getTiles(int numOfTiles){
        LinkedList<String> tilesCollection = new LinkedList<String>();

        for (int i=0;i<numOfTiles;i++){
            tilesCollection.add(firstInstance.listOfLetters.remove(0));
        }
        return tilesCollection;
    }

}
