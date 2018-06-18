package org.songli.mcsync.config;

import lombok.Data;

import java.util.List;

@Data
public class Config {

    String name;

    String path;

    String remoteUrl;

    ConfigOperatin operatin;

    ConfigType type;

    List<Config> dependencies;
}
