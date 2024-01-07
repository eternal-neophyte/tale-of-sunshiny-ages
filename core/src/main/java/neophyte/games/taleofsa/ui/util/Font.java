package neophyte.games.taleofsa.ui.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public enum Font implements AssetEnum {

    EXO_2_LIGHT_ITALIC,
    GALIVER_SANS,
    GPUTEKS_REGULAR,
    GPUTEKS_BOLD,
    KAPPAS_POROROCA,
    LINERAMA_BOLD;

    public static final String SUPPORTED_CHARACTERS =
            "ABCDEFGHIJKLMNOPGRSTUVWXYZ" +
            "abcdefghijklmnopgrstuvwxyz" +
            "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ" +
            "абвгдеёжзийклмнопрстуфхцчшщъыьэюя" +
            "0123456789 -+=\\/.,:;()*%!?\0";

    public BitmapFont bitmapFont(int size) {
        var parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = size;
        return bitmapFont(parameter);
    }

    public BitmapFont bitmapFont(FreeTypeFontGenerator.FreeTypeFontParameter parameter) {
        parameter.characters = SUPPORTED_CHARACTERS;
        parameter.mono = false;
        parameter.genMipMaps = true;
        parameter.minFilter = Texture.TextureFilter.MipMapLinearLinear;
        parameter.magFilter = Texture.TextureFilter.Linear;

        String fontPath = String.format("font/%s.ttf", assetName());
        var generator = new FreeTypeFontGenerator(Gdx.files.internal(fontPath));

        var font = generator.generateFont(parameter);
        font.getData().markupEnabled = true;
        generator.dispose();
        return font;
    }
}
