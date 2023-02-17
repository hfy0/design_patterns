public class Main {
    public static void main(String[] args) {

        // ResourcePoolConfig0使用举例
        ResourcePoolConfig0 config0 = new ResourcePoolConfig0("dbconnectionpool");
        config0.setMaxTotal(16);
        config0.setMaxIdle(8);
        System.out.println(config0);

        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig1 config1 = new ResourcePoolConfig1.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();

    }
}