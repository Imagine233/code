package day0717.demo03;

public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceStaticImap impl = new MyInterfaceStaticImap();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();//这是接口的静态方法
    }
}
