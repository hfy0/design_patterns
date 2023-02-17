package factory.RuleConfigParserFactory2;

import ruleConfigParser.IRuleConfigParser;
import ruleConfigParser.JsonRuleConfigParser;

public class JsonRuleConfigParserFactory implements  IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
