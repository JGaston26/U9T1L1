public class Desktop extends Computer {
    private String caseType;
    private int monitorLength;

    public Desktop(String OS, String CPU,String name,String caseType, int monitorLength){
        super(OS,CPU,name);
        this.caseType = caseType;
        this.monitorLength = monitorLength;
    }

    public String getCaseType(){
       return caseType;
    }
    public int getMonitorLength(){
        return monitorLength;
    }
}
