package ruleConfigParser;

import factory.other.RuleConfig;

public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("yaml 文件解析");
    }
}
