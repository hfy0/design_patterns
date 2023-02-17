package ruleConfigParser;

import factory.other.RuleConfig;

public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("Json 文件解析");
    }
}
