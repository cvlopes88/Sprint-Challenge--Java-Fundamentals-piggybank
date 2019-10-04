package piggybank;

public abstract class Coin {

    private static int maxId = 0;
    private int id;
    private String name;
    private double inValue;
    private int inNumberOf;
   private double total;

    public Coin( int inNumberOf, String name){

        this.id = maxId++;
        this.name = name;
        this.inValue = inValue;
        this.inNumberOf = inNumberOf;
        this.total = total;
        
    }

    public int getInNumberOf(){
        return inNumberOf ;
    }
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getInValue(){
        return inValue;
    }
 

    public double getTotal(){
        return total;
    }
  
    
}