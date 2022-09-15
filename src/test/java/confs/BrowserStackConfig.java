package confs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:credential.properties")
public interface BrowserStackConfig extends Config {
    String username();

    String accessKey();

    String project();

    String build();

    String name();

    String appUrl();

    String device();

    String osVersion();

    String bsUrl();
}
