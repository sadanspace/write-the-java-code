package design.parttern.demo.factory.abstracfactory;

public interface IConfigParserFactory {
    /**
     * 规则配置解析器
     *
     * @return
     */
    IRuleConfigParser createRuleParser();

    /**
     * 系统配置解析器
     *
     * @return
     */
    ISystemConfigParser createSystemParser();

    // ... 业务配置解析器等等
}
