package factory.RuleConfigParserFactory2;

import ruleConfigParser.IRuleConfigParser;
import ruleConfigParser.PropertiesRuleConfigParser;

public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {


    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
