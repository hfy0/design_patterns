package ruleConfigParser;

import factory.other.RuleConfig;

public class PropertiesRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("Properties 文件解析");
    }
}
