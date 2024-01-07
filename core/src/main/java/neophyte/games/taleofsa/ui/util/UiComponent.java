package neophyte.games.taleofsa.ui.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public enum UiComponent implements AssetEnum {


    ;

    private TextureAtlas atlas;
    private Skin skin;

    public TextureAtlas atlas() {
        if (atlas == null) {
            String atlasPath = String.format("texture/%s.atlas", assetName());
            atlas = new TextureAtlas(Gdx.files.internal(atlasPath));
        }
        return atlas;
    }

    public Skin skin() {
        if (skin == null) {
            String stylePath = String.format("style/%s.json", assetName());
            skin = new Skin(Gdx.files.internal(stylePath), atlas());
        }
        return skin;
    }
}
