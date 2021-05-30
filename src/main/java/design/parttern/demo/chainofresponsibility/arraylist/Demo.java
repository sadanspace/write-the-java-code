package design.parttern.demo.chainofresponsibility.arraylist;

public class Demo {
    public static void main(String[] args) {
        IHandler handlerA = new ConcreteHandlerA();
        IHandler handlerB = new ConcreteHandlerB();
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(handlerA);
        handlerChain.addHandler(handlerB);
        handlerChain.handle();
    }
}
