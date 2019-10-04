package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {



    public static void main(String[] args){

    System.out.println( Quarter.getValue(0));
    // System.out.println(Quarter.getInValue());

    


     

    ArrayList<Coin> piggyBank = new ArrayList<>();

    piggyBank.add(new Quarter(4, "quarter"));
    piggyBank.add(new Quarter(10, "quarter"));
    for(Coin q: piggyBank){
        System.out.println("*******"+ q);
    }

    }
}