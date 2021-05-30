package design.parttern.demo.chainofresponsibility.arraylist;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<IHandler>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler: handlers){
            if (handler.handle()){
                break;
            }
        }
    }
}
