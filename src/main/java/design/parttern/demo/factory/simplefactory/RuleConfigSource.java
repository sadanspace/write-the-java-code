package design.parttern.demo.factory.simplefactory;

public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        // 从ruleConfigFilePath中读取配置文本到configText中
        String configText = "";
        IRuleConfigParser ruleConfigParser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        if (ruleConfigParser == null) {
            throw new InvalidRuleConfigException(
                    "Rule Config file format is not supported: " + ruleConfigFileExtension);
        }
        return ruleConfigParser.parse(configText);
    }

    private String getFileExtension(String ruleConfigFilePath) {
        // ...解析文件名获取扩展名，例如：rule.json，返回json
        return "json";
    }
}
