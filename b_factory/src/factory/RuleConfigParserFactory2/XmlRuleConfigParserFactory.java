package factory.RuleConfigParserFactory2;

import ruleConfigParser.IRuleConfigParser;
import ruleConfigParser.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements  IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
