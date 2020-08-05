package day0805.demo02;

public class Demo02Main {
    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //impl.method();//实现类覆盖重写了方法

        //使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();//匿名内部类实现了方法

    }
}
