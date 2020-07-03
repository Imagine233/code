package day0703.demo01.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length = "aoushdoguibzcgoiue".length();
        System.out.println("字符串的长度是：" + length);//18

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);//Hello
        System.out.println(str2);//World
        System.out.println(str3);//HelloWorld
        System.out.println("===========");

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);//e
        System.out.println("=============");

        //查找参数字符串在本来字符串当中出现的第一次索引位置，如果根本没有返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index);//2
        System.out.println("HelloWorld".indexOf("abc"));//-1
    }
}
