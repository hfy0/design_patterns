package list.handler;

public class HandlerB implements IHandler{
    @Override
    public boolean handle() {
        boolean handled = false;
        // ...
        System.out.println("调用 HandlerB 的 handler() 成功");
        return handled;
    }
}
