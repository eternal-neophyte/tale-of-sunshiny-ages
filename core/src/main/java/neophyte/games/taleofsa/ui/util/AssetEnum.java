package neophyte.games.taleofsa.ui.util;

public interface AssetEnum {

    default String assetName() {
        return name().toLowerCase().replaceAll("_", "-");
    }

    String name();
}
