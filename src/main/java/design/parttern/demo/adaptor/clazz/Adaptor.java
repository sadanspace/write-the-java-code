package design.parttern.demo.adaptor.clazz;

public class Adaptor extends Adaptee implements ITarget{
    public void f1() {
        // f1的实现可以调用adaptee的方法
        super.fa();
    }

    public void f2() {
        // f2的实现可以自定义
    }
}
