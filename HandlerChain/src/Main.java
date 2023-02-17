import linkedList.HandlerChainB;
import linkedList.handler.HandlerC;
import linkedList.handler.HandlerD;
import list.HandlerChainA;
import list.handler.HandlerA;
import list.handler.HandlerB;

public class Main {
    public static void main(String[] args) {

        // 使用数组来存储所有的处理器
        HandlerChainA chainA = new HandlerChainA();
        chainA.addHandler(new HandlerA());
        chainA.addHandler(new HandlerB());
        chainA.handle();

        // 使用链表来存储所有的处理器
        HandlerChainB chainB = new HandlerChainB();
        chainB.addHandler(new HandlerC());
        chainB.addHandler(new HandlerD());
        chainB.handle();
    }
}