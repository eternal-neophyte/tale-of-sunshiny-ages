package neophyte.games.talesofsa.engine.util.json;

import com.badlogic.gdx.utils.Json;
import neophyte.games.taleofsa.engine.util.json.JsonFields;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JsonFieldsTest {

    @Test
    public void testFields() {
        Assertions.assertDoesNotThrow(() -> {
            JsonFields f = new JsonFields()
                .bind("1")
                .to(Object.class)
                .and()
                .bind("2")
                .to(Integer.class)
                .and()
                .bind("3")
                .to(String.class);
            f.accept(new Json());
        });
    }
}
