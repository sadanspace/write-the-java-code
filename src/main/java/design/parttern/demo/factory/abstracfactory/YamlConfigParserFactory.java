package design.parttern.demo.factory.abstracfactory;

public class YamlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new YamlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new YamlSystemConfigParser();
    }
}
