package design.parttern.demo.factory.abstracfactory;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IConfigParserFactory factory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (factory == null) {
            throw new InvalidRuleConfigException(
                    "Rule Config file format is not supported: " + ruleConfigFilePath
            );
        }

        IRuleConfigParser parser = factory.createRuleParser();
        // 从ruleConfigFilePath中读取配置文本到configText中
        String configText = "";
        return parser.parse(configText);
    }

    private String getFileExtension(String ruleConfigFilePath) {
        // ...解析文件名获取扩展名，例如：rule.json，返回json
        return "json";
    }
}
