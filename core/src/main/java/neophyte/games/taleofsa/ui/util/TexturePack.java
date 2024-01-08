package neophyte.games.taleofsa.ui.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public enum TexturePack implements AssetEnum {

    MOVE_ACTION_BUTTONS
    ;

    private TextureAtlas atlas;
    private Skin skin;

    public TextureAtlas atlas() {
        if (atlas == null) {
            String atlasPath = "texture/" + assetName() + ".atlas";
            atlas = new TextureAtlas(Gdx.files.internal(atlasPath));
        }
        return atlas;
    }

    public Skin skin() {
        if (skin == null) {
            String stylePath = "style/" + assetName() + ".json";
            skin = new Skin(Gdx.files.internal(stylePath), atlas());
        }
        return skin;
    }
}
