package day0717.demo02;

public class Demo020Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefalut a = new MyInterfaceDefaultA();
        //调用抽象方法，实际运行的是右侧实现类
        a.methodAbs();//实现了抽象方法，AAA

        //调用默认方法，如果实现类当中没有，会向上找接口
        a.methodDefault();// 这是新添加的默认方法
        System.out.println("=============");

        MyInterfaceDefalutB b = new MyInterfaceDefalutB();
        b.methodAbs();//实现了抽象方法，BBB
        b.methodDefault();// 实现类B覆盖重写了接口的默认方法
    }
}
