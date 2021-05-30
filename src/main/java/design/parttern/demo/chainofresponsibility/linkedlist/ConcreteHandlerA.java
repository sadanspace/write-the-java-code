package design.parttern.demo.chainofresponsibility.linkedlist;

public class ConcreteHandlerA extends Handler {
    protected boolean doHandle() {
        boolean handled = false;
        // ... 处理逻辑
        System.out.println("ConcreteHandlerA handle");
        return handled;
    }
}
