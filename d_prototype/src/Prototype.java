// 虽然 Cloneable 接口只起标识作用，接口内无方法，但是仍然需要实现，否则在调用 clone() 时将会抛出 CloneNotSupportedException 异常
public class Prototype implements Cloneable {
    private String str;

    public Prototype() {
    }

    public Prototype(String str) {
        this.str = str;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "str='" + str + '\'' +
                '}';
    }
}
