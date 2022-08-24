package ru.job4j.tracker;

public class StubOutput implements Output {

    private final StringBuilder buffer = new StringBuilder();

    @Override
    public String println(Object obj) {
        if (obj != null) {
            buffer.append(obj.toString());
        } else {
            buffer.append("null");
        }
        buffer.append(System.lineSeparator());
        return null;
    }

    @Override
    public String toString() {
        return buffer.toString();
    }
}
