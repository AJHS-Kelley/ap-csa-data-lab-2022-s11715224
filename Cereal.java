// robin/rachel macdonald, AP Data Lab 1/10/2022 v.0.2

public class Cereal {
  
    private String cerealName;
    private double fiber;
    private double cup;
    private double fiberPerCup;

    public Cereal(String cerealName, double fiber, double cup, double fiberPerCup){
        
        name= cerealName;
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

        return FPS;
    }
}
