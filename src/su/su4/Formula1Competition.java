package su.su4;

public class Formula1Competition implements  ICompetition{
    private  int winnersTime;
    private Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return new Participant[0];
    }
}
