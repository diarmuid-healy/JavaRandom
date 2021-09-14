package application;

import java.util.Random;

public class tournament 
{  
    //variables
    private static int bladerNum1;
    private static int bladerNum2;
    private static int bladerNum3;
    private static int bladerNum4;
    private static String bladerName1;
    private static String bladerName2;
    private static String bladerName3;
    private static String bladerName4;
    
    //bladers
    private blader tyson = new blader(1,"Tyson",true);
    private blader daichi = new blader(2,"Daichi",false);
    private blader kenny = new blader(3,"Kenny",false);
    private blader kai = new blader(4,"Kai",false);
    private blader max = new blader(5,"Max",true);
    private blader ray = new blader(6,"Ray",true);
    private blader lee = new blader(7,"Lee",false);
    private blader kevin = new blader(8,"Kevin",false);
    private blader mariah = new blader(9,"Mariah",false);
    private blader gary = new blader(10,"Gary",false);
    private blader rick = new blader(11,"Rick",false);
    private blader steven = new blader(12,"Steven",false);
    private blader michael = new blader(13,"Michael",false);
    private blader emily = new blader(14,"Emily",false);
    private blader eddy = new blader(15,"Eddy",false);
    private blader tala = new blader(16,"Tala",true);
    private blader spencer = new blader(17,"Spencer",false);
    private blader bryan = new blader(18,"Bryan",false);
    private blader ian = new blader(19,"Ian",false);
    private blader raul = new blader(20,"Raul",false);
    private blader julia = new blader(21,"Julia",true);
    private blader mathilda = new blader(22,"Mathilda",false);
    private blader miguel = new blader(23,"Miguel",true);
    private blader claude = new blader(24,"Claude",false);
    private blader aaron = new blader(25,"Aaron",false);
    //blaser list
    blader[] bladers =
    {
        tyson, daichi, kenny, kai, max,
        ray, lee, kevin, mariah, gary,
        rick, steven, michael, emily, eddy,
        tala, spencer, bryan, ian, raul,
        julia, mathilda, miguel, claude, aaron
    };
    
    //teams
    //BBA Revolution
    blader[] bbaRevolutionTeam = 
    {
        tyson, daichi, kenny
    };
    team bbaRevolution = new team(1,"BBA Revolution",0,0,bbaRevolutionTeam);
        
    //White Tiger X
    blader[] whiteTigerXTeam = 
    {
        ray, lee, mariah, gary, kevin
    };
    team whiteTigerX = new team(2,"White Tiger X",0,0,whiteTigerXTeam);
        
    //PPB All Stars
    blader[] ppbAllStarsTeam = 
    {
        max, rick, michael, steven, emily, eddy
    };
    team ppbAllStars = new team(3,"PPB All Stars",0,0,ppbAllStarsTeam);
        
    //F Dynasty
    blader[] fDynastyTeam = 
    {
        raul, julia
    };
    team fDynasty = new team(4,"F Dynasty",0,0,fDynastyTeam);
        
    //Barthez Battallion
    blader[] barthezBattallionTeam = 
    {
        miguel, mathilda, aaron, claude
    };
    team barthezBattallion = new team(5,"Barthez Battallion",0,0,barthezBattallionTeam);
        
    //Blitzkreig Boys
    blader[] blitzkreigBoysTeam =
    {
        kai, tala, spencer, bryan, ian
    };
    team blitzkreigBoys = new team(6,"Blitzkreig Boys",0,0,blitzkreigBoysTeam);
    
    //team list
    team[] teamList = 
    {
        bbaRevolution, whiteTigerX, ppbAllStars, fDynasty, barthezBattallion, blitzkreigBoys,
    };
    
    //constructor
    public tournament()
    {
        
    }
    
    //Sets Fixtures
    public void setFixtures()
    {
        //TODO
    }
    
    //Selects first competitor
    public void selectCompetitor1(int teamNum1)
    {      
        Random rnd = new Random();
        for(int i=0; i<teamList.length; i++)
        {
            if(teamList[i].teamNum == teamNum1)
            {
                int numOfBladers = teamList[i].bladers.length;
                int randomDraw = rnd.nextInt(numOfBladers + 1);
                for(int j=0; j<numOfBladers; j++)
                {
                    for(int k=0; k<teamList.length; k++)
                    {
                        if(teamList[j].teamNum == randomDraw)
                        {
                            bladerNum1 = bladers[k].getBladerNum();
                        }
                    }
                }
            }
        }
    }
    //Selects second competitor
    public void selectCompetitor2(int teamNum2)
    {
        Random rnd = new Random();
        for(int i=0; i<teamList.length; i++)
        {
            if(teamList[i].teamNum == teamNum2)
            {
                int numOfBladers = teamList[i].bladers.length;
                int randomDraw = rnd.nextInt(numOfBladers + 1);
                for(int j=0; j<numOfBladers; j++)
                {
                    for(int k=0; k<teamList.length; k++)
                    {
                        if(teamList[j].teamNum == randomDraw)
                        {
                            bladerNum2 = bladers[k].getBladerNum();
                        }
                    }
                }
            }
        }
    }
    //Selects third competitor
    public void selectCompetitor3(int teamNum1)
    {      
        Random rnd = new Random();
        for(int i=0; i<teamList.length; i++)
        {
            if(teamList[i].teamNum == teamNum1)
            {
                int numOfBladers = teamList[i].bladers.length;
                int randomDraw = rnd.nextInt(numOfBladers + 1);
                for(int j=0; j<numOfBladers; j++)
                {
                    for(int k=0; k<teamList.length; k++)
                    {
                        if(teamList[j].teamNum == randomDraw)
                        {
                            bladerNum3 = bladers[k].getBladerNum();
                        }
                    }
                }
            }
        }
    }
    //Selects fourth competitor
    public void selectCompetitor4(int teamNum2)
    {
        Random rnd = new Random();
        for(int i=0; i<teamList.length; i++)
        {
            if(teamList[i].teamNum == teamNum2)
            {
                int numOfBladers = teamList[i].bladers.length;
                int randomDraw = rnd.nextInt(numOfBladers + 1);
                for(int j=0; j<numOfBladers; j++)
                {
                    for(int k=0; k<teamList.length; k++)
                    {
                        if(teamList[j].teamNum == randomDraw)
                        {
                            bladerNum4 = bladers[k].getBladerNum();
                        }
                    }
                }
            }
        }
    }
    
    //simulates the match
    public String matchSimulation()
    {
        //getting first bladers name
        for(int i=0; i<bladers.length; i++)
        {
            if(bladers[i].bladerNum == bladerNum1)
            {
                bladerName1 = bladers[i].bladerName;
            }
        }
        
        //getting second bladers name
        for(int i=0; i<bladers.length; i++)
        {
            if(bladers[i].bladerNum == bladerNum2)
            {
                bladerName2 = bladers[i].bladerName;
            }
        }
        
        //getting third bladers name
        for(int i=0; i<bladers.length; i++)
        {
            if(bladers[i].bladerNum == bladerNum3)
            {
                bladerName3 = bladers[i].bladerName;
            }
        }
        
        //getting fourth bladers name
        for(int i=0; i<bladers.length; i++)
        {
            if(bladers[i].bladerNum == bladerNum4)
            {
                bladerName4 = bladers[i].bladerName;
            }
        }
        //output
        StringBuilder sb = new StringBuilder();
        //game1
        sb.append("Match 1: ");
        sb.append("\n");
        sb.append(bladerName1);
        sb.append(" V ");
        sb.append(bladerName2);
        //game2
        sb.append("\n");
        sb.append("Match 2: ");
        sb.append("\n");
        sb.append(bladerName3);
        sb.append(" V ");
        sb.append(bladerName4);
        return sb.toString();
    }
}
