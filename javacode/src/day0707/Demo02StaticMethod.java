package day0707;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();//首先创建对象
        obj.method();//然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic();//正确，不推荐，这种写法在编译之后也会被javac翻译成为“类名称.静态方法名”
        MyClass.methodStatic();
    }

}
