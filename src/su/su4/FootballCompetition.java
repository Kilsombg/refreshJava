package su.su4;

public class FootballCompetition implements  ICompetition{
    private  int fastestGoal;
    private Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return new Participant[0];
    }
}
