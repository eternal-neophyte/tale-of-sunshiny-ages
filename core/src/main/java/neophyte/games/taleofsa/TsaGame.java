package neophyte.games.taleofsa;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import neophyte.games.taleofsa.ui.component.Components;
import neophyte.games.taleofsa.ui.screen.CommonScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class TsaGame extends Game {

    private CommonScreen moveActionScreen;

    @Override
    public void create() {
        moveActionScreen = new CommonScreen(Components.newMoveActionMenu());
        setScreen(moveActionScreen);
    }

    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.F)) {
            Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
        }
        super.render();
    }
}
