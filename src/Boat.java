public class Boat extends Vehicle{
    private int hullLength;
    private int propellerSpeed;

    public Boat(String name, int wheels, int hullLength, int propellerSpeed){
        super(name,wheels);
        this.hullLength = hullLength;
        this.propellerSpeed = propellerSpeed;
    }

    public int getHullLength(){
        return hullLength;
    }
    public int getPropellerSpeed(){
        return propellerSpeed;
    }
    public void honkBoatHorn(){
        System.out.println("HOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOONK");
    }
}
