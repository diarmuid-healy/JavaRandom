package application;

public class team 
{
    int teamNum;
    String teamName;
    int wins;
    int losses;
    blader[] bladers;
            
    public team(int teamNum, String teamName, int wins, int losses, blader[] bladers)
    {
        this.teamNum = teamNum;
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.bladers = bladers;
    }
}
