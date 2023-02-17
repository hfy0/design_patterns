package linkedList.handler;

public abstract class Handler {

    public Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public final void handle() {
        boolean handled = doHandler();
        if (nextHandler != null && !handled) {
            nextHandler.handle();
        }
    }

    /**
     * 设置为 protected 修饰符，防止在 HandlerChain 类中直接调用 doHandler() 方法
     * @return
     */
    protected abstract boolean doHandler();
}
