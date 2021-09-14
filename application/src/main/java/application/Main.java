package application;

public class Main 
{
    public static void main(String[] args) 
    {
        tournament worldChampionship = new tournament();
        worldChampionship.selectCompetitor1(3);
        worldChampionship.selectCompetitor2(1);
        worldChampionship.selectCompetitor3(3);
        worldChampionship.selectCompetitor4(1);
        System.out.print(worldChampionship.matchSimulation());
    }
}
