/**
 * 通过组合，使代理类和被代理类产生联系
 */
public class UserControllerProxy1 implements IUserController {

    IUserController userController;

    public UserControllerProxy1(UserController userController) {
        this.userController = userController;
    }

    @Override
    public UserVo login(String telephone, String password) {

        System.out.println("执行 login() 的附加代码");
        // 委托
        UserVo userVo = userController.login(telephone, password);
        return userVo;
    }

    @Override
    public UserVo register(String telephone, String password) {
        System.out.println("执行 register() 的附加代码");
        // 委托
        UserVo userVo = userController.register(telephone, password);
        return userVo;
    }
}
