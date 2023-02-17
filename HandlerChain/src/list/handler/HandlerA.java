package list.handler;

public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        // ...
        System.out.println("调用 HandlerA 的 handler() 成功");
        return handled;
    }
}
