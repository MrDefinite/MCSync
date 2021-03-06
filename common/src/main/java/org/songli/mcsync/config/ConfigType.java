package org.songli.mcsync.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConfigType {

    MAC_SHELL(0, "MacShellCmd"),
    MAC_GIT(1, "MacGit"),
    MAC_IDEA(2, "MacIdea"),
    MAC_SYS(3, "MacSystem")
    ;

    private int value;

    private String name;

    ConfigType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static ConfigType findByInt(int value) {
        for (ConfigType item : ConfigType.values()) {
            if (item.value == value) {
                return item;
            }
        }

        return null;
    }

    @JsonCreator
    public static ConfigType findByString(String name) {
        for (ConfigType item : ConfigType.values()) {
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
