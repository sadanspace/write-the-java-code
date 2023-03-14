package design.parttern.demo.factory.simplefactory;

public class UseCase {
    public static void main(String[] args) throws InvalidRuleConfigException {
        RuleConfigSource ruleConfigSource = new RuleConfigSource();
        RuleConfig ruleConfig = ruleConfigSource.load("c:\\demo.json");
        System.out.println(ruleConfig);
    }
}
