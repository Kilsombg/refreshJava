package su.su4;

public class HorseCompetition implements ICompetition{
    private  boolean breed;
    private Participant[] schedule;

    @Override
    public Participant[] getSchedule() {
        return new Participant[0];
    }
}
