package org.songli.mcsync.graph;


import org.songli.mcsync.config.Config;

import java.util.Collection;
import java.util.List;

public interface ConfigGraphService {

    List<ConfigGraph> parseAndGetGraphs(Collection<Config> configs);


}
