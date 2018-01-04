package xyz.fabiano.one.dsl;

import java.util.function.Consumer;
import java.util.function.Function;

public class Builder {

    public Builder extract(String name, Function<Context, Connection> connector, String select) {
        return this;
    }

    public Builder transform(String name, Consumer<Context> transformer) {
        return this;
    }

    public Builder load(String name, Function<Context, Connection> connector, String tableName) {
        return this;
    }

    public Configuration build() {
        return new Configuration();
    }
}
