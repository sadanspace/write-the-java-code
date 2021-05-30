package design.parttern.demo.chainofresponsibility.linkedlist;

public class ConcreteHandlerB extends Handler {
    protected boolean doHandle() {
        boolean handled = false;
        // ... 处理逻辑
        System.out.println("ConcreteHandlerB handle");
        return handled;
    }
}
