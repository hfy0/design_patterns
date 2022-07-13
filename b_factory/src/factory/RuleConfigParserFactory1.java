package factory;

import ruleConfigParser.*;

/**
 * 将对象创建方法 createParser() 剥离到一个独立的类中，让这个类只负责对象的创建。
 * 这个类就是简单工厂模式类。
 */
public class RuleConfigParserFactory1 {
    public static IRuleConfigParser createParser(String ruleConfigFileExtension) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
