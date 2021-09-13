package application;

public class tournament 
{  
    //variables
    private static int blader1;
    private static int blader2;
            
    //teams
    private team bbaRevolution;
    private team whiteTigerX;
    private team ppbAllStars;
    private team fDynasty;
    private team barthezBattallion;
    private team blitzkreigBoys;
    
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
    
    //constructor
    public tournament()
    {
        
    }
    
    //assemblingTeams - Teams Being Assembled by adding bladers to a team
    public void assemblingTeams()
    {
        //BBA Revolution
        blader[] bbaRevolutionTeam = new blader[3];
        bbaRevolutionTeam[0] = tyson;
        bbaRevolutionTeam[1] = daichi;
        bbaRevolutionTeam[2] = kenny;
        bbaRevolution = new team(1,"BBA Revolution",0,0,bbaRevolutionTeam);
        
        //White Tiger X
        blader[] whiteTigerXTeam = new blader[5];
        whiteTigerXTeam[0] = ray;
        whiteTigerXTeam[1] = lee;
        whiteTigerXTeam[2] = mariah;
        whiteTigerXTeam[3] = gary;
        whiteTigerXTeam[4] = kevin;
        whiteTigerX = new team(2,"White Tiger X",0,0,whiteTigerXTeam);
        
        //PPB All Stars
        blader[] ppbAllStarsTeam = new blader[6];
        ppbAllStarsTeam[0] = max;
        ppbAllStarsTeam[1] = rick;
        ppbAllStarsTeam[2] = steven;
        ppbAllStarsTeam[3] = emily;
        ppbAllStarsTeam[4] = michael;
        ppbAllStarsTeam[5] = eddy;
        ppbAllStars = new team(3,"PPB All Stars",0,0,ppbAllStarsTeam);
        
        //F Dynasty
        blader[] fDynastyTeam = new blader[2];
        fDynastyTeam[0] = raul;
        fDynastyTeam[1] = julia;
        fDynasty = new team(4,"F Dynasty",0,0,fDynastyTeam);
        
        //Barthez Battallion
        blader[] barthezBattallionTeam = new blader[4];
        barthezBattallionTeam[0] = mathilda;
        barthezBattallionTeam[1] = claude;
        barthezBattallionTeam[2] = miguel;
        barthezBattallionTeam[3] = aaron;
        barthezBattallion = new team(5,"Barthez Battallion",0,0,barthezBattallionTeam);
        
        //Blitzkreig Boys
        blader[] blitzkreigBoysTeam = new blader[5];
        blitzkreigBoysTeam[0] = kai;
        blitzkreigBoysTeam[1] = tala;
        blitzkreigBoysTeam[2] = spencer;
        blitzkreigBoysTeam[3] = bryan;
        blitzkreigBoysTeam[4] = ian;
        blitzkreigBoys = new team(6,"Blitzkreig Boys",0,0,blitzkreigBoysTeam);
    }
    
    public void setFixtures()
    {
        //TODO
    }
    
    public void selectCompetitor(int teamNum1, int teamNum2)
    {
        team[] teams = new team[6];
        teams[0] = bbaRevolution;
        teams[1] = whiteTigerX;
        teams[2] = ppbAllStars;
        teams[3] = fDynasty;
        teams[4] = barthezBattallion;
        teams[5] = blitzkreigBoys;
        
        for (int i=0; i<teams.length; i++)
        {
            if(teams[i].teamNum == teamNum1)
            {
                
            }
            else if(teams[i].teamNum == teamNum2)
            {
                
            }
                    
        }
    }
    
    public void matchSimulation(int bladerNum1, int bladerNum2)
    {
        
    }
}
