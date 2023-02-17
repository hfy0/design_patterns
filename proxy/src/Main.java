public class Main {
    public static void main(String[] args) {
        System.out.println("以下打印为，使用组合实现代理模式");
        // 使用组合，实现代理模式
        IUserController userController1 = (IUserController) new UserControllerProxy1(new UserController());
        UserVo userVo1 = userController1.login("", "");
        System.out.println(userVo1);
        UserVo userVo2 = userController1.register("", "");
        System.out.println(userVo1);
        System.out.println("==========================");

        System.out.println("以下打印为，使用继承实现代理模式");
        // 使用继承，实现代理模式
        IUserController userController2 = (IUserController) new UserControllerProxy2();
        UserVo userVo3 = userController1.login("", "");
        System.out.println(userVo3);
        UserVo userVo4 = userController1.register("", "");
        System.out.println(userVo4);
        System.out.println("==========================");

        System.out.println("以下打印为，动态代理的实现");
        // 动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        IUserController userController3 = (IUserController) dynamicProxy.createProxy(new UserController());
        UserVo userVo5 = userController3.login("", "");
        System.out.println(userVo5);
        UserVo userVo6 = userController3.register("", "");
        System.out.println(userVo6);
        System.out.println("==========================");

    }
}