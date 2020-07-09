package day0709.demo02;

public class Demo02Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没有写，但是会继承来自父类的method方法
        teacher.method();//方法执行！

        //创建另一个子类：助教 的对象
        Assistant assistant = new Assistant();
        assistant.method();//方法执行！
    }
}
