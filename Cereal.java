// robin/rachel macdonald, AP Data Lab 1/12/2022 v.0.7

public class Cereal {
  
    private String name;
    private double fiber0;
    private double cup0;
    private double FPC;

    public Cereal(String cerealName, double fiber, double cup, double fiberPerCup){
        
        name = cerealName;
        fiber0 = fiber;
        cup0 = cup;
        FPC = fiberPerCup;

    }

    public Cereal(){

        name = "";
        fiber0 = 0.0;
        cup0 = 0.0;
        FPC = 0.0;


    }

    //Getters

    public String getNames(){

        return name;
    }
    
    public double getFiber(){

        return fiber0;
    }
    public double getCup(){

        return cup0;
    }

    public double getFPS(){

        return FPC;
    }

//toString method

public String toString(){

    return "Cereal Name: " + name + "\nFiber Content: " + fiber0 +"\nSereving Size (CUPS): " + cup0 + "\nFiber Per Cup: " + FPC;
}

public static void main(String[] args){

   Cereal food1 = new Cereal();
   System.out.println(food1.toString());
    
    Cereal food2 = new Cereal ("Raisin Bran", 5.0, 0.75, 0.0);
    System.out.println(food2.toString());



}






}
