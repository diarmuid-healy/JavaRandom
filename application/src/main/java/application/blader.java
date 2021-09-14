package application;

public class blader 
{
    int bladerNum;
    String bladerName;
    boolean captain;
    
    public blader(int bladerNum, String bladerName, boolean captain)
    {
        this.bladerNum = bladerNum;
        this.bladerName = bladerName;
        this.captain = captain;
    }
    
    public int getBladerNum()
    {
        return bladerNum;
    }
    
    public String getBladerName()
    {
        return bladerName;
    }
}
