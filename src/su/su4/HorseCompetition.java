package su.su4;

public class HorseCompetition implements ICompetition{
    private  boolean breed;
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
