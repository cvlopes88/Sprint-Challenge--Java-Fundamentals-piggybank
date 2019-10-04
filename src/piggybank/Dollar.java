package piggybank;

public class Dollar extends Coin {

    public Dollar(int inNumberOf, String name){
        super(inNumberOf, name);
    }


    public String getName(){
        return "$";
    }

    
    public static double getValue(int a){
        if(a == a){
            return a * 1;
        }else{
            return 1;
        }
        
    }

    public double getInValue(){
        return 1;
    }

    public double getTotal(){
       return getValue(getInNumberOf());
    }

    
    @Override
    public String toString() {
        return getName() + getValue(getInNumberOf()) ;
    }
}