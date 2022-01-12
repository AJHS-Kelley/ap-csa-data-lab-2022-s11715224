// robin/rachel macdonald, AP Data Lab 1/12/2022 v.0.5

public class Cereal {
  
    private String name;
    private double fiber;
    private double cup;
    private double FPC;

    public Cereal(String name, double fiber, double cup, double fiberPerCup){
        
        name = name;
        fiber = fiber;
        cup = cup;
        FPC = fiberPerCup;

    }

    public Cereal(){

        name = "";
        fiber = 0.0;
        cup = 0.0;
        FPC = 0.0;


    }

    //Getters

    public String getNames(){

        return name;
    }
    
    public double getFiber(){

        return fiber;
    }
    public double getCup(){

        return cup;
    }

    public double getFPS(){

        return FPC;
    }

//toString method

public String toString(){

    return "Cereal Name: " + name + "\nFiber Content: " + fiber +"\nSereving Size (CUPS): " + cup + "\nFiber Per Cup: " + FPC;
}

public static void main(String[] args){

   Cereal food1 = new Cereal();
   System.out.println(food1.toString());
    
    Cereal food2 = new Cereal ("Raisin Bran", 5.0, 0.75, 0.0);
    System.out.println(food2.toString());



}






}
