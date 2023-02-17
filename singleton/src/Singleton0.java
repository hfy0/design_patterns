/**
 * 饿汉式
 */
public class Singleton0 {
    private static Singleton0 instance = new Singleton0();

    private Singleton0() {

    }

    public static Singleton0 getInstance() {
        return instance;
    }
}
