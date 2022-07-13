package factory;

import factory.RuleConfigParserFactory2.*;
import factory.other.InvalidRuleConfigException;
import factory.other.RuleConfig;
import ruleConfigParser.*;

/**
 * 工厂方法模式的实现
 */
public class RuleConfigSource2 {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        // 获取文件的拓展名（后缀，如 .json）
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        // 工厂方法模式
        // 对于下面几个 RuleConfigParserFactory 是可以复用的，可以再用简单工厂模式优化工厂的创建过程，并提前缓存创建好的工厂对象
        // 这里不再优化
        IRuleConfigParserFactory parserFactory = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new JsonRuleConfigParserFactory();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new XmlRuleConfigParserFactory();
        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new YamlRuleConfigParserFactory();
        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
            parserFactory = new PropertiesRuleConfigParserFactory();
        } else {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    public IRuleConfigParser createParser(String ruleConfigFileExtension) {
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

    /**
     * 测试时，用匿名类重写该方法，直接返回指定的拓展名
     * <p>
     * 该方法本该为 private 的，但为了让匿名类能够重写，因此设置为 protected
     *
     * @param filePath 对于本 demo 来说无用
     * @return 返回指定的拓展名
     */
    protected String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}

