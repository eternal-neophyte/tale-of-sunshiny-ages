package neophyte.games.taleofsa.engine.entity;

import neophyte.games.taleofsa.engine.common.GameStateConsumer;
import neophyte.games.taleofsa.engine.common.GameStatePredicate;

public class HistoryPage {

    private String title;
    private String text;
    private Type type;
    private boolean canRepeat;
    private GameStateConsumer consequencesForHumankind;
    private GameStateConsumer consequencesForServants;
    private GameStatePredicate appearanceConstraint;

    public enum Type {
        POSITIVE,
        CONTROVERSIAL,
        CATASTROPHE
    }
}
