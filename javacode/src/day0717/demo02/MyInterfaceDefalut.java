package day0717.demo02;

public interface MyInterfaceDefalut {
    //抽象方法
    public abstract void methodAbs();

    //新添加的方法改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
