package day0803;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();//外部类的对象
        //通过外部类的对象调用外部类的方法，里面间接在使用内部类Heart
        body.methodBody();
        System.out.println("=============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
