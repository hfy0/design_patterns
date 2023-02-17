package linkedList;

import linkedList.handler.Handler;

public class HandlerChainB {
    private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
        } else {
            tail.setNextHandler(handler);
            tail = handler;
        }
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
