package factory.RuleConfigParserFactory2;

import ruleConfigParser.IRuleConfigParser;
import ruleConfigParser.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
