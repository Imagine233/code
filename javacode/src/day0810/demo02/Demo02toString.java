package day0810.demo02;

public class Demo02toString {
    public static void main(String[] args) {
        //String --> StringBuilder
        String str = "hello";
        System.out.println("str:" + str);
        StringBuilder bu = new StringBuilder(str);//str:hello

        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println("bu:" + bu);//bu:helloworld

        //StringBuilder --> String
        String s = bu.toString();
        System.out.println("s:" + s);//s:helloworld


    }
}
