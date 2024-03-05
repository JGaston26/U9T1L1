public class Bicycle extends Vehicle{
    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount){
        super(name,wheels);
        this.gearCount = gearCount;
    }

    public void ringBells(){
        System.out.println("Ring, ring ring ring ring.");
    }

    public int getGearCount(){
        return gearCount;
    }
}
