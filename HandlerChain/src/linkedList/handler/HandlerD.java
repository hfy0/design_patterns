package linkedList.handler;

public class HandlerD extends Handler {

    @Override
    protected boolean doHandler() {
        boolean handled = false;
        // ...
        System.out.println("调用 HandlerD 的 doHandler() 成功");
        return handled;
    }
}

