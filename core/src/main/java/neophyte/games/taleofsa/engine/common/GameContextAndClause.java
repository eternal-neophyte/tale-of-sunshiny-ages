package neophyte.games.taleofsa.engine.common;

import java.util.List;

public class GameContextAndClause implements GameContextPredicate {

    private List<GameContextPredicate> operands;

    @Override
    public boolean test(GameContext gameContext) {
        return operands.stream().allMatch(op -> op.test(gameContext));
    }
}
