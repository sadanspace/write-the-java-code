package design.parttern.demo.chainofresponsibility.linkedlist;

public class App {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerChain.addHandler(handlerA);
        handlerChain.addHandler(handlerB);
        handlerChain.handle();
    }
}
