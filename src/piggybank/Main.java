package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main {


  

    public static void main(String[] args){
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    


     

    ArrayList<Coin> piggyBank = new ArrayList<>();

    
    piggyBank.add(new Quarter(1, "quarter"));
    piggyBank.add(new Dime(1, "dime"));
    piggyBank.add(new Dollar(5, "dollar"));
    piggyBank.add(new Nickel(3, "nickel"));
    piggyBank.add(new Dime(7, "dimes"));
    piggyBank.add(new Dollar(1, "dollar"));
    piggyBank.add(new Penny(10, "pennies"));
    for(Coin q: piggyBank){

    if(q instanceof Dollar){
        System.out.println(q.getName()+ q.getInNumberOf());
    }else{
        System.out.println(q.getInNumberOf()+ " " + q.getName());
    }


        
       
        
        
}

    System.out.println();
 
    
    double total = 0.00;
    for(Coin t: piggyBank){
        if (t instanceof Quarter){
          total = total + (t.getTotal());
        }
        if(t instanceof Dollar){
            total = total + (t.getTotal());
        }
        if(t instanceof Penny){
            total = total + (t.getTotal());
        }
        if(t instanceof Nickel){
            total = total + (t.getTotal());
        }
        if(t instanceof Dime){
            total = total + (t.getTotal());
        }
    }
    
  
System.out.println();


System.out.println("\n\nThe Piggy holds "+ fp.format(total));
}
}