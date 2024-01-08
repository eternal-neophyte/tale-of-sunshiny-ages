package neophyte.games.taleofsa;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import neophyte.games.taleofsa.ui.component.Components;
import neophyte.games.taleofsa.ui.screen.CommonScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class TsaGame extends ApplicationAdapter {

    private CommonScreen moveActionScreen;

    @Override
    public void create() {
        moveActionScreen = new CommonScreen(Components.newMoveActionMenu());
        moveActionScreen.show();
        moveActionScreen.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }


    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.F)) {
            Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
        }
        moveActionScreen.render(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void dispose() {
        moveActionScreen.hide();
    }
}
