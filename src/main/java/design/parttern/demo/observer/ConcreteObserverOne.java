package design.parttern.demo.observer;


public class ConcreteObserverOne implements Observer {
    public void update(Message message) {
        // 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverOne is notified.");
    }
}
