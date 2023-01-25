package ch.anchialas.quarkus;

import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

/**
 * File Logging configuration.
 */
@ConfigMapping(prefix = "foo.demo.filelog")
@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public interface FileLogConfig {

    /**
     * Enable logging to a file.
     */
    @WithDefault("true")
    boolean enable();

    /**
     * The log format.
     */
    @WithDefault("%d{yyyy-MM-dd HH:mm:ss,SSS} %h %N[%i] %-5p [%c{1.}] (%t) %s%e%n")
    String format();


}
