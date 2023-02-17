package factory;

import factory.other.InvalidRuleConfigException;
import factory.other.RuleConfig;

public class Main {
    public static void main(String[] args) throws InvalidRuleConfigException {

        // 测试不用设计模式的 RuleConfigSource
        RuleConfigSource0 ruleConfigSource00 = new RuleConfigSource0() {
            @Override
            protected String getFileExtension(String filePath) {
                //...解析文件名获取扩展名，比如rule.json，返回json
                return "json";
            }
        };
        RuleConfigSource0 ruleConfigSource01 = new RuleConfigSource0() {
            @Override
            protected String getFileExtension(String filePath) {
                //...解析文件名获取扩展名，比如rule.json，返回json
                return "xml";
            }
        };
        RuleConfigSource0 ruleConfigSource02 = new RuleConfigSource0() {
            @Override
            protected String getFileExtension(String filePath) {
                //...解析文件名获取扩展名，比如rule.json，返回json
                return "yaml";
            }
        };
        RuleConfigSource0 ruleConfigSource03 = new RuleConfigSource0() {
            @Override
            protected String getFileExtension(String filePath) {
                //...解析文件名获取扩展名，比如rule.json，返回json
                return "properties";
            }
        };










        // 不用设计模式的 RuleConfigSource0
        RuleConfig load00 = ruleConfigSource00.load("...");
        RuleConfig load01 = ruleConfigSource01.load("...");
        RuleConfig load02 = ruleConfigSource02.load("...");
        RuleConfig load03 = ruleConfigSource03.load("...");
        // 用简单工厂模式的 RuleConfigSource1


        // 用工厂方法模式的 RuleConfigSource2


        System.out.println("以下四个为不用设计模式的 RuleConfigSource0");
        System.out.println(load00);
        System.out.println(load01);
        System.out.println(load02);
        System.out.println(load03);
        System.out.println("以下四个为用简单工厂模式的 RuleConfigSource1");

        System.out.println("以下四个为用工厂方法模式的 RuleConfigSource2");



    }
}