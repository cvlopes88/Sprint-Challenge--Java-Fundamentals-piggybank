package piggybank;

public abstract class Coin {

    private static int maxId = 0;
    private int id;
    private String name;
    private double inValue;
    private int inNumberOf;
   

    public Coin( int inNumberOf, String name){

        this.id = maxId++;
        this.name = name;
        this.inValue = inValue;
        this.inNumberOf = inNumberOf;
        
        
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    // public double getValue(){
    //     return value;
    // }
    public double getInValue(){
        return inValue;
    }


    
}