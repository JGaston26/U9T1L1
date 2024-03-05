public class Laptop extends Computer {
    private int trackPadSize;

    public Laptop(String OS, String CPU,String name,int trackPadSize){
        super(OS,CPU,name);
        this.trackPadSize = trackPadSize;
    }
    public int getTrackPadSize(){
        return trackPadSize;
    }
    public void open(){
        System.out.println("Im open");
    }
    public void close(){
        System.out.println("I'm closed");
    }
}
