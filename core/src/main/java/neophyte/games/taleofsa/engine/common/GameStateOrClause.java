package neophyte.games.taleofsa.engine.common;

import java.util.List;

public class GameStateOrClause implements GameStatePredicate {

    private List<GameStatePredicate> operands;

    @Override
    public boolean test(GameState gameState) {
        return operands.stream().anyMatch(op -> op.test(gameState));
    }
}
