package design.parttern.demo.template.callback;

public class BClass {
    public void process(ICallback callback) {
        // ...
        callback.methodToCallBack();
        // ...
    }

    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallback() { // 回调对象
            public void methodToCallBack() {
                System.out.println("call back me.");
            }
        });
    }
}
