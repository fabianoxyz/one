package xyz.fabiano.one.dsl;

import java.util.Map;
import java.util.function.Consumer;

public class OneStream {

    public OneStream map(Consumer<Map<String, String>> simpleMap) {
        return this;
    }
}
