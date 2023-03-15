package design.parttern.demo.factory.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String ruleConfigFileExtension) {
        if (ruleConfigFileExtension == null || ruleConfigFileExtension.isEmpty()) {
            return null;
        }
        return cachedFactories.get(ruleConfigFileExtension);
    }
}
