/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionstructurelab;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author arzatalf
 */
public class DecisionStructureLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner wif= new Scanner(System.in);
        System.out.println("hello there traveler welcome to copyright infringement"
                + ", would you like to QUIT or"
                + " STAY and try and win");
        out.print("I will...");
        String answer1;
        answer1=wif.nextLine();

        if ("QUIT".equals(answer1)){
            out.println("good choice but to do that you have to press x");
        } else {
            out.println("too bad there isnt any game left please exit");
        }
        //part 2
        out.println("seriously im asking you to leave theres no game left");
        out.print("ok fine pick a sword (gold/wood)");
        String answer2;
        answer2=wif.nextLine();
        if ("wood".equals(answer2)){
            out.println("ok you picked the obvoius good sword but your getting gold");
        } else {
            out.println("so you were born with more than 2 chromosomes");
        }
        out.println("now with your gold sword you will fight the evil that the "
                + "cops cant deal with aka the frogs on the street");
        
    }
}

