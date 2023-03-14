package design.parttern.demo.factory.simplefactory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String ruleConfigFileExtension) {
        if (ruleConfigFileExtension == null || ruleConfigFileExtension.isEmpty()) {
            return null;
        }
        return cachedParsers.get(ruleConfigFileExtension.toLowerCase());
    }
}
