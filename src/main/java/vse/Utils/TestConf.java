package vse.Utils;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadPolicy;
import static org.aeonbits.owner.Config.Sources;

@LoadPolicy
@Sources({"file:src/main/resources/tConfig.properties"})
public interface TestConf extends Config {
    @Key("baseURL")
    String baseURL();

    @Key("remoteUrl")
    String remoteURL();
}
