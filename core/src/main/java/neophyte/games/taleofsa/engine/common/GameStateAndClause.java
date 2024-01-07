package neophyte.games.taleofsa.engine.common;

import java.util.List;

public class GameStateAndClause implements GameStatePredicate {

    private List<GameStatePredicate> operands;

    @Override
    public boolean test(GameState gameState) {
        return operands.stream().allMatch(op -> op.test(gameState));
    }
}
