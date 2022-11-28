package su.su4;

import org.w3c.dom.events.EventException;

public class CreateEvent {

    public ICompetition getEvent(String competitionType) throws EventException {
        return switch (competitionType) {
            case "Football" -> new FootballCompetition();
            case "Horse" -> new HorseCompetition();
            case "Formula1" -> new Formula1Competition();
            default -> throw new EventException((short) 1, "There is no such competition.");
        };
    }

    public void fillSchedule(ICompetition ob, Participant[] schedule) throws EmptySetException {
        if(schedule == null) throw new EmptySetException();
        ob.setSchedule(schedule);
    }

    public static void bets(ICompetition ob, int id, double bet) {
        for(Participant p : ob.getSchedule()){
            if(p.id == id){
                p.betForWin = (bet+p.betForWin) / p.betForWin;
            }

            if(p.chanceToWin < 1.1) p.chanceToWin = 1.1;
            else {
                p.chanceToWin -= p.betForWin;
            }
        }
    }
}
