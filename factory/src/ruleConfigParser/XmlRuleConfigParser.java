package ruleConfigParser;

import factory.other.RuleConfig;

public class XmlRuleConfigParser implements IRuleConfigParser{
    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("xml 文件解析");
    }
}
