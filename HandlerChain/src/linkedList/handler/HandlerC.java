package linkedList.handler;

public class HandlerC extends Handler {

    @Override
    protected boolean doHandler() {
        boolean handled = false;
        // ...
        System.out.println("调用 HandlerC 的 doHandler() 成功");
        return handled;
    }
}
