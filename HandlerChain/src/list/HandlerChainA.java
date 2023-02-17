package list;

import list.handler.IHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * HandlerChain 类使用数组来存储所有的处理器。
 * 在 HandlerChain 的 handle() 方法中，依次调用每个处理器的 handle() 方法。
 */
public class HandlerChainA {

    List<IHandler> handlers = new ArrayList<>();

    public void handle() {
        for (IHandler handler : handlers) {
            if (handler.handle()) {
                return;
            }
        }
    }

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }
}
