package neophyte.games.taleofsa.engine.common;

import java.util.List;

public class GameContextOrClause implements GameContextPredicate {

    private List<GameContextPredicate> operands;

    @Override
    public boolean test(GameContext gameContext) {
        return operands.stream().anyMatch(op -> op.test(gameContext));
    }
}
