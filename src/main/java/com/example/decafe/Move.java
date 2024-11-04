package com.example.decafe;

public enum Move {
    NONE("none"),
    UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    private final String name;

    private Move(String s) {
        name = s;
    }

    public boolean equals(String value) {
        return name.equals(value);
    }
    public String getName() {
        return this.name;
    }

}
