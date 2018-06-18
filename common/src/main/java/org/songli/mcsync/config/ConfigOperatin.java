package org.songli.mcsync.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConfigOperatin {
    // Need to be executed
    EXEC(0, "execute"),
    // Need to place to machine
    MOVE(1, "move"),
    ;

    private int value;

    private String name;

    ConfigOperatin(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ConfigOperatin findByInt(int value) {
        for (ConfigOperatin item : ConfigOperatin.values()) {
            if (item.value == value) {
                return item;
            }
        }

        return null;
    }

    @JsonCreator
    public static ConfigOperatin findByString(String name) {
        for (ConfigOperatin item : ConfigOperatin.values()) {
            if (item.name.equals(name)) {
                return item;
            }
        }

        return null;
    }

    @JsonValue
    public String toString() {
        return this.name;
    }

    public int toInt() {
        return this.value;
    }
    
}
