package design.parttern.demo.factory.setup;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException(
                    "Rule Config file format is not supported: " + ruleConfigFilePath
            );
        }

        // 从ruleConfigFilePath中读取配置文本到configText中
        String configText = "";
        return parser.parse(configText);
    }

    private String getFileExtension(String ruleConfigFilePath) {
        // ...解析文件名获取扩展名，例如：rule.json，返回json
        return "json";
    }
}
