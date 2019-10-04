package piggybank;

public class Dime extends Coin {
    
    public Dime(int inNumberOf, String name){
        super(inNumberOf, name);
      
    }
   

    public  String getName(){
        if(getInNumberOf() > 1){
            return "Dimes";
            }else{
                return "Dime";
            }
    }
    
    
    public double getTotal(){
        return getValue(getInNumberOf());
     }
    public static double getValue(int a){
        if(a == a){
            return a * 0.10;
        }else{
            return 0.10;
        }
        
    }

    public double getInValue(){
        return 0.10;
    }


    @Override
    public String toString() {
        return getValue(getInNumberOf()) + " "+ getName() ;
    }
}