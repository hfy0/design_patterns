/**
 * 通过继承，使代理类和被代理类产生联系
 */
public class UserControllerProxy2 extends UserController {

    @Override
    public UserVo login(String telephone, String password) {
        System.out.println("执行 login() 的附加代码");
        return super.login(telephone, password);
    }

    @Override
    public UserVo register(String telephone, String password) {
        System.out.println("执行 register() 的附加代码");
        return super.register(telephone, password);
    }
}
