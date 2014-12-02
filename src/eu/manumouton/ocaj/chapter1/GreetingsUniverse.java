package eu.manumouton.ocaj.chapter1;

import eu.manumouton.ocaj.chapter1.planets.Earth;
import eu.manumouton.ocaj.chapter1.planets.Mars;
import eu.manumouton.ocaj.chapter1.planets.Venus;

/**
 * Created by manu on 2/12/14.
 */
public class GreetingsUniverse {
    public static void main(String[] args){
        System.out.println("Hello Universe!");
        Earth earth = new Earth();
        Venus venus = new Venus();
        Mars mars = new Mars();
    }
}
