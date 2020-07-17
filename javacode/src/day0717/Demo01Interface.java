package day0717;

public class Demo01Interface {
    public static void main(String[] args) {
        //创建实现类的对象使用
        MyInterfaceAbstract impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();//这是第一个方法！
        impl.methodAbs2();//这是第二个方法！
        impl.methodAbs3();//这是第三个方法！
        impl.methodAbs4();//这是第四个方法！
    }
}
