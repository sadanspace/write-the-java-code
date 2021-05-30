package design.parttern.demo.chainofresponsibility.arraylist;

public class ConcreteHandlerA implements IHandler {
    public boolean handle() {
        boolean handled = false;
        // ... 处理逻辑
        System.out.println("ConcreteHandlerA handle");
        return handled;
    }
}
