package neophyte.games.taleofsa.ui.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class CommonScreen extends ScreenAdapter {

    protected Viewport viewport;
    protected Stage stage;
    protected Actor[] actors;

    public CommonScreen(Actor... actors) {
        this.actors = actors;
    }

    @Override
    public void show() {
        viewport = new FillViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        for (var actor : actors) {
            stage.addActor(actor);
        }
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();
    }
}
