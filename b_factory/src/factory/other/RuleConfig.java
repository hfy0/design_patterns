package factory.other;

/**
 * 做什么：factory.other.RuleConfig 用于存储配置文件信息
 * <p>
 * 怎么做：根据配置文件的后缀（json、xml、yaml、properties），
 * 选择不同的解析器（ruleConfigParser.JsonRuleConfigParser、ruleConfigParser.XmlRuleConfigParser……），
 * 将存储在配置文件中的配置项解析成内存对象 factory.other.RuleConfig。
 */
public class RuleConfig {
    /**
     * 为了简化代码，用 mock 数据
     */
    String str;

    public RuleConfig(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "RuleConfig{" +
                "str='" + str + '\'' +
                '}';
    }
}
