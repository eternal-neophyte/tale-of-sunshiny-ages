package neophyte.games.taleofsa.ui.component;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import neophyte.games.taleofsa.ui.component.builder.TextButtonBuilder;
import neophyte.games.taleofsa.ui.component.builder.VerticalScrollPaneBuilder;
//import neophyte.games.taleofsa.ui.util.Font;
import neophyte.games.taleofsa.ui.util.UiComponent;

public final class Components {

    private Components() {
    }

    public static ScrollPane newMoveActionMenu() {
        var skin = UiComponent.MOVE_ACTION_BUTTONS.skin();
        //var font = Font.GPUTEKS_REGULAR.bitmapFont(20);
        /*var textButtonPreset = new TextButtonBuilder()
            .skin(skin)
            .font(null)
            .fontColor("#5F5F70");*/




        var historyPageButton = new TextButton("Страницы истории", skin, "history-page-button");
        var blessingButton = new TextButton("Благословения", skin, "blessing-button");
        var missionButton = new TextButton("Миссии", skin, "mission-button");
        var devTreeButton = new TextButton("Вевти развития", skin, "dev-tree-button");
        var settingsButton = new TextButton("Настройки", skin, "settings-button");
        var moveDoneButton = new TextButton("Завершить ход", skin, "move-done-button");
        moveDoneButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("Move");
            }
        });
        return new VerticalScrollPaneBuilder()
                .x(10)
                .y(10)
                .width(1300)
                .space(50)
                .isVisible(true)
                .actors(historyPageButton, blessingButton, missionButton,
                        devTreeButton, settingsButton, moveDoneButton)
                .skin(skin)
                .build();
    }
}
