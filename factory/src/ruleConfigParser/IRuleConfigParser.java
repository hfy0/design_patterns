package ruleConfigParser;

import factory.other.RuleConfig;

public interface IRuleConfigParser {

    RuleConfig parse(String configText);
}
