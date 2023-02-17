public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("原型");
        Prototype clone = prototype.clone();
        System.out.println(prototype);
        System.out.println(clone);
    }
}