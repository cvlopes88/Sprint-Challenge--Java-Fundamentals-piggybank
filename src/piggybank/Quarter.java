package piggybank;

public class Quarter extends Coin {
    
    public Quarter(int inNumberOf, String name){
        super(inNumberOf, name);
      
    }
    
    // public static double add(double a, double b){
       
    //     return a+b;

    // }

    public  String getName(){
        return "Quarter";
    }
    
    public static double getValue(int a){
        if(a == a){
            return a * 0.25;
        }else{
            return 0.25;
        }
        
    }

    public double getInValue(){
        return 0.25;
    }

    public static int getInNumberOf(){
        return 4 ;
    }

    @Override
    public String toString() {
        return getValue(getInNumberOf()) + " "+ getName() ;
    }
}