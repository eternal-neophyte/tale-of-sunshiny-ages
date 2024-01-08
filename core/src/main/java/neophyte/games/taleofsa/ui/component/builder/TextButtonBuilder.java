package neophyte.games.taleofsa.ui.component.builder;

import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import java.util.ArrayList;
import java.util.List;

public class TextButtonBuilder {

    private Skin skin;
    private String style;
    private String text;
    private float scale = 1.0f;
    private final List<EventListener> listeners = new ArrayList<>();


    public TextButtonBuilder skin(Skin skin) {
        this.skin = skin;
        return this;
    }

    public TextButtonBuilder style(String style) {
        this.style = style;
        return this;
    }

    public TextButtonBuilder text(String text) {
        this.text = text;
        return this;
    }

    public TextButtonBuilder scale(float scale) {
        this.scale = scale;
        return this;
    }

    public TextButtonBuilder listeners(EventListener listener) {
        listeners.add(listener);
        return this;
    }

    public TextButton build() {
        var button = new TextButton(text, skin, style);
        button.setScale(scale);
        listeners.forEach(button::addListener);
        return button;
    }
}
