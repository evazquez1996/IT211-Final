public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins;
    private int losses;


    // TODO: Define mutator methods -
    //       setName(), setWins(), setLosses()

    public void setTeamName(String name){
        this.name = name;
    }

    public void setWins(int wins){
        this.wins = wins;
    }

    public void setLosses(int losses){
        this.losses = losses;
    }

    // TODO: Define accessor methods -
    //       getName(), getWins(), getLosses()

    public String getName(){
        return name;
    }

    public int getWins(){
        return wins;
    }

    public int getLosses(){
        return losses;
    }

    // TODO: Define getWinPercentage()
    public float getWinPercentage(){
        return (float) wins / (wins + losses);
    }

    // TODO: Define printStanding()
    public void printStanding(){
        if(getWinPercentage() >= 0.5){
            System.out.printf("Win percentage: %.2f\n", getWinPercentage());
            System.out.println("Congratulations, Team " + getName() + " has the winning average!");
        } else {
            System.out.printf("Win percentage: %.2f\n", getWinPercentage());
            System.out.println("Team " + getName() + " has a losing average!");
        }
    }
}
