package piggybank;

public class Nickel extends Coin {
    
    public Nickel(int inNumberOf, String name){
        super(inNumberOf, name);
      
    }
   

    public  String getName(){
        if(getInNumberOf() > 1){
            return "Nickels";
            }else{
                return "Nickel";
            }
    }
    
    public double getTotal(){
        return getValue(getInNumberOf());
     }
    
    public static double getValue(int a){
        if(a == a){
            return a * 0.05;
        }else{
            return 0.05;
        }
        
    }

    public double getInValue(){
        return 0.05;
    }


    @Override
    public String toString() {
        return getValue(getInNumberOf()) + " "+ getName() ;
    }
}