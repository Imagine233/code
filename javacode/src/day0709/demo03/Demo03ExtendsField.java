package day0709.demo03;

public class Demo03ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//10 只能使用父类的东西，没有任何子类内容
        System.out.println("===========");

        Zi zi = new Zi();

        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20
        System.out.println("===========");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//优先子类，200
        System.out.println("===========");

        //这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi();//200
        //这个方法是在父类当中定义的
        zi.methodFu();//100
    }
}
