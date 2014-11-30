package eu.manumouton.ocaj;

import java.util.ArrayList;
import java.io.*;

/**
 * Created by manu on 30/11/14.
 */
public class MainClass {

    public static void main(String args[]){
        Console console = System.console();
        String giveMeYourFavoriteProgrammingLanguage = console.readLine("\nGive me your favorite programming language: ");
        ArrayList<String> prLanguagesList = new ArrayList<>();
        prLanguagesList.add(giveMeYourFavoriteProgrammingLanguage);
        prLanguagesList.add("Angularjs");

        System.out.println(prLanguagesList);

    }
}
