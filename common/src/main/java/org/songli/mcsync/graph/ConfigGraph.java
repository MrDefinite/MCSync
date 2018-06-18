package org.songli.mcsync.graph;

import lombok.Data;
import org.songli.mcsync.config.Config;

@Data
public class ConfigGraph {

    Config root;

    int depth;

    int maxWidth;
}
