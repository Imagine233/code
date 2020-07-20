package day0720.demo01;

public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();//子类方法
        obj.methodFu();//父类特有方法
    }
}
