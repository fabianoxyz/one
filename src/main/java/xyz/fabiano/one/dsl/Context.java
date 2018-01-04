package xyz.fabiano.one.dsl;

public class Context {

    public Connection getConnection(String name) {
        return new Connection();
    }

    public OneStream get(String name) {
        return new OneStream();
    }
}
