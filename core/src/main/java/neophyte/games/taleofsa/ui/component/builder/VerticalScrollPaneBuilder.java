package neophyte.games.taleofsa.ui.component.builder;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup;

import java.util.Objects;

public class VerticalScrollPaneBuilder {

    private final VerticalGroup group = new VerticalGroup();
    private Skin skin;
    private boolean isVisible = false;
    private int x;
    private int y;
    private int width;
    private int height;

    public VerticalScrollPaneBuilder skin(Skin skin) {
        this.skin = skin;
        return this;
    }

    public VerticalScrollPaneBuilder isVisible(boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    public VerticalScrollPaneBuilder x(int x) {
        this.x = x;
        return this;
    }

    public VerticalScrollPaneBuilder y(int y) {
        this.y = y;
        return this;
    }

    public VerticalScrollPaneBuilder width(int width) {
        this.width = width;
        return this;
    }

    public VerticalScrollPaneBuilder height(int height) {
        this.height = height;
        return this;
    }

    public VerticalScrollPaneBuilder space(float space) {
        group.space(space);
        return this;
    }

    public VerticalScrollPaneBuilder padTop(float padTop) {
        group.padTop(padTop);
        return this;
    }

    public VerticalScrollPaneBuilder actors(Actor... actors) {
        for (var actor : actors) {
            group.addActor(actor);
        }
        return this;
    }

    public ScrollPane build() {
        Objects.requireNonNull(skin, "skin");
        var scrollPane = new ScrollPane(group, skin);
        scrollPane.setPosition(x, y);
        scrollPane.setSize(width, height);
        scrollPane.setVisible(isVisible);
        return scrollPane;
    }
}
