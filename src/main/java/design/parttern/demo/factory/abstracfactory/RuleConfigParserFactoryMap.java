package design.parttern.demo.factory.abstracfactory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {

    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("properties", new PropertiesConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
    }

    public static IConfigParserFactory getParserFactory(String ruleConfigFileExtension) {
        if (ruleConfigFileExtension == null || ruleConfigFileExtension.isEmpty()) {
            return null;
        }
        return cachedFactories.get(ruleConfigFileExtension);
    }
}
