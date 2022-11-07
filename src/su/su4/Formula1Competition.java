package su.su4;

public class Formula1Competition implements  ICompetition{
    private  int winnersTime;
    private Participant[] schedule = null;

    @Override
    public Participant[] getSchedule() {
        return new Participant[0];
    }

    @Override
    public void setSchedule(Participant[] schedule) {
        this.schedule = schedule;
    }
}
