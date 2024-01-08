package neophyte.games.taleofsa.ui.component;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import neophyte.games.taleofsa.ui.component.builder.VerticalScrollPaneBuilder;
import neophyte.games.taleofsa.ui.util.TexturePack;
import neophyte.games.taleofsa.ui.util.UiUtils;

import java.util.ArrayList;
import java.util.List;

public final class Components {

    private Components() {
    }

    public static ScrollPane newMoveActionMenu() {
        float scale = 1, blurSize = 75 * 2;
        var skin = TexturePack.MOVE_ACTION_BUTTONS.skin();
        List<TextButton> buttons = new ArrayList<>() {{
            add(new TextButton("Страницы истории", skin, "history-page-button"));
            add(new TextButton("Благословения", skin, "blessing-button"));
            add(new TextButton("Миссии", skin, "mission-button"));
            add(new TextButton("Ветви развития", skin, "dev-tree-button"));
            add(new TextButton("Настройки", skin, "settings-button"));
            add(new TextButton("Завершить ход", skin, "move-done-button"));
        }};
        buttons.forEach(button -> button.addListener(new InputListener() {
            @Override
            public void enter(InputEvent event, float x, float y, int pointer, Actor fromActor) {
                UiUtils.resizeInPlace(button, blurSize, blurSize, scale);
            }

            @Override
            public void exit(InputEvent event, float x, float y, int pointer, Actor toActor) {
                UiUtils.resizeInPlace(button, -blurSize, -blurSize, scale);
            }
        }));
        return new VerticalScrollPaneBuilder()
                .x(100)
                .y(10)
                .width(1500)
                .space(75)
                .isVisible(true)
                .actors(buttons)
                .skin(skin)
                .build();
    }
}
