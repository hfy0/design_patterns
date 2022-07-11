package org.example;

public class Main {
    public static void main(String[] args) {
        Singleton0 instance1 = Singleton0.getInstance();
        Singleton0 instance2 = Singleton0.getInstance();
        System.out.println(instance2 == instance1);

        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance3 == instance4);

        Singleton3 instance5 = Singleton3.getInstance();
        Singleton3 instance6 = Singleton3.getInstance();
        System.out.println(instance5 == instance6);

        Singleton4 instance7 = Singleton4.INSTANCE;
        Singleton4 instance8 = Singleton4.INSTANCE;
        System.out.println(instance7 == instance8);
    }
}