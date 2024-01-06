package neophyte.games.taleofsa.engine.util.json;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;

public final class JsonMapper {

    private static final Json JSON = new Json();

    private JsonMapper() {
    }

    public static <T> T read(String path, Class<T> klass, JsonFields fieldsToBind) {
        fieldsToBind.accept(JSON);
        return JSON.fromJson(klass, Gdx.files.internal(path));
    }
}
