import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 作为一个动态代理类，动态地给每个需要附加相同功能的类创建代理类
 */
public class DynamicProxy {

    /**
     * 创建代理
     *
     * @param proxiedObject 被代理对象
     * @return 代理对象
     */
    public Object createProxy(Object proxiedObject) {
        ClassLoader classLoader = proxiedObject.getClass().getClassLoader();
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(proxiedObject);
        /**
         * ClassLoader loader：定义代理类的类加载器
         * Class<?>[] interfaces：代理类要实现的接口列表
         * InvocationHandler h：将方法调用分派给的调用处理程序
         */
        return Proxy.newProxyInstance(classLoader, interfaces, dynamicProxyHandler);
    }

    private class DynamicProxyHandler implements InvocationHandler {

        private Object proxiedObject;

        public DynamicProxyHandler() {
        }

        public DynamicProxyHandler(Object proxiedObject) {
            this.proxiedObject = proxiedObject;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.printf("被代理对象 proxiedObject = %s ,执行方法 method = %s", proxiedObject, method);
            System.out.println("执行附加代码");

            Object result = method.invoke(proxiedObject, args);
            return result;
        }
    }

}
