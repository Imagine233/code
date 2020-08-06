package day0806;

public class Demo01Main {
    public static void main(String[] args) {
        //Person类默认继承了Object类，所以可以使用Object类中的toString方法
        Person p = new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//day0806.Person@1540e19d
        //直接打印对象的名字，其实就是调用对象的toString方法 p = p.toString();
        System.out.println(p);//day0806.Person@1540e19d

    }
}
