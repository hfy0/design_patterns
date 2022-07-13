package factory;

import factory.other.InvalidRuleConfigException;
import factory.other.RuleConfig;
import ruleConfigParser.*;

/**
 * 简单工厂模式的实现
 */
public class RuleConfigSource1 {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        // 获取文件的拓展名（后缀，如 .json）
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        // 封装对象的创建过程，将对象的创建过程封装到工厂类中，将对象的创建和使用相分离
        IRuleConfigParser parser = RuleConfigParserFactory1.createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
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
