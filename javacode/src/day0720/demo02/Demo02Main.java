package day0720.demo02;

public class Demo02Main {
    public static void main(String[] args) {
        //对象的向上转型，就说父类引用指向子类对象
        Animal animal = new Cat();//本来创建的时候是一只猫
        animal.eat();//猫吃鱼

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();//猫抓老鼠

        //下面是错误的向下转型
        //本来new的时候是一只猫，现在非要当作狗
        //Dog dog = (Dog) animal;//错误写法，编译不会报错，但是运行会出现异常

    }
}
