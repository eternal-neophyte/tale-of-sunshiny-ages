package neophyte.games.taleofsa.engine.entity;

import neophyte.games.taleofsa.engine.common.GameContextConsumer;
import neophyte.games.taleofsa.engine.common.GameContextPredicate;

public class HistoryPage {

    private String title;
    private String text;
    private Type type;
    private boolean canRepeat;
    private GameContextConsumer consequencesForHumankind;
    private GameContextConsumer consequencesForServants;
    private GameContextPredicate appearanceConstraint;

    public enum Type {
        POSITIVE,
        CONTROVERSIAL,
        CATASTROPHE
    }
}
