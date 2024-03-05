public class Computer {
    private String OS;
    private String CPU;
    private String name;

    public Computer(String OS, String CPU,String name){
        this.OS = OS;

        this.CPU = CPU;
        this.name = name;
    }
    public String getOS(){
        return OS;
    }
    public String getCPU(){
        return CPU;
    }
    public String getName(){
        return name;
    }
    public void turnOn(){
        System.out.println("On");
    }
    public void turnOff(){
        System.out.println("Off");
    }
}
