package factory.other;

/**
 * 自定义异常，用于无匹配的解析器时抛出
 */
public class InvalidRuleConfigException extends Exception {

    private String message;

    public InvalidRuleConfigException(String message) {
        this.message = message;
    }
}
