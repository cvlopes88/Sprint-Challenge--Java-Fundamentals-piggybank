package piggybank;

public class Penny extends Coin {
    
    public Penny(int inNumberOf, String name){
        super(inNumberOf, name);
      
    }
   

    public  String getName(){
        if(getInNumberOf() > 1){
        return "Pennies";
        }else{
            return "Penny";
        }
    }
    
    public double getTotal(){
        return getValue(getInNumberOf());
     }
    
    public static double getValue(int a){
        if(a == a){
            return a * 0.01;
        }else{
            return 0.01;
        }
        
    }

    public double getInValue(){
        return 0.01;
    }


    @Override
    public String toString() {
        return getValue(getInNumberOf()) + " "+ getName() ;
    }
}