package org.songli.mcsync.config;

import lombok.Data;

import java.util.List;

@Data
public class Config {

    String name;

    String path;

    String remoteUrl;

    String execCmd;

    ConfigType type;

    List<Config> dependencies;
}
