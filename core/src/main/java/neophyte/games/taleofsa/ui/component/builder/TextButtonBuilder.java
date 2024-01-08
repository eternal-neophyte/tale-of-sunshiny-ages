package neophyte.games.taleofsa.ui.component.builder;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class TextButtonBuilder {

    private String text;
    private Skin skin;
    private String style;
    private BitmapFont font;
    private String fontColor;

    public TextButtonBuilder text(String text) {
        this.text = text;
        return this;
    }

    public TextButtonBuilder skin(Skin skin) {
        this.skin = skin;
        return this;
    }

    public TextButtonBuilder style(String style) {
        this.style = style;
        return this;
    }

    public TextButtonBuilder font(BitmapFont font) {
        this.font = font;
        return this;
    }

    public TextButtonBuilder fontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    public TextButton build() {
        Label.LabelStyle s = new Label.LabelStyle(font, Color.valueOf(fontColor));
        var label = new Label(text, s);
        var b = new TextButton(text, skin, style);
        b.setLabel(label);
        return b;
    }
}
