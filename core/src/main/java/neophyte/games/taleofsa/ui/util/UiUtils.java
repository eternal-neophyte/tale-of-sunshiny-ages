package neophyte.games.taleofsa.ui.util;

import com.badlogic.gdx.scenes.scene2d.Actor;

public final class UiUtils {

    private UiUtils() {
    }

    public static void resizeInPlace(Actor actor, float x, float y, float scale) {
        resize(actor, x, y, scale);
        pullToLeftBottom(actor, x / 2, y / 2, scale);
    }

    public static void resize(Actor actor, float x, float y, float scale) {
        actor.setWidth(actor.getWidth() + x * scale);
        actor.setHeight(actor.getHeight() + y * scale);
    }

    public static void pullToLeftBottom(Actor actor, float x, float y, float scale) {
        actor.setX(actor.getX() - x * scale);
        actor.setY(actor.getY() - y * scale);
    }
}
