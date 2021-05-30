package design.parttern.demo.chainofresponsibility.arraylist;

public class ConcreteHandlerB implements IHandler {
    public boolean handle() {
        boolean handled = false;
        // ... 处理逻辑
        System.out.println("ConcreteHandlerB handle");
        return handled;
    }
}
