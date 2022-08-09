public class TestTeam {
    public static void main(String[] args){
        Team winners = new Team();

        winners.setTeamName("Ravens");
        winners.setWins(13);
        winners.setLosses(3);

        winners.printStanding();

        winners.setTeamName("Angels");
        winners.setWins(80);
        winners.setLosses(82);

        winners.printStanding();
    }
}
