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
}
