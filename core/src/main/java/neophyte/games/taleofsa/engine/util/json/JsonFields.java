package neophyte.games.taleofsa.engine.util.json;

import com.badlogic.gdx.utils.Json;

import java.util.function.Consumer;

public class JsonFields implements Consumer<Json> {

    private String name;
    private Class<?> klass;

    public JsonFields bind(String name) {
        this.name = name;
        return this;
    }

    public JsonFields to(Class<?> klass) {
        this.klass = klass;
        return this;
    }

    public JsonFields and() {
        return new JsonFields() {

            @Override
            public void accept(Json json) {
                JsonFields.this.accept(json);
                super.accept(json);
            }
        };
    }

    @Override
    public void accept(Json json) {
        json.addClassTag(name, klass);
    }
}
