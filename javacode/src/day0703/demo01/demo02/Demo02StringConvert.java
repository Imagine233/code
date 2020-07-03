package day0703.demo01.demo02;

public class Demo02StringConvert {
    public static void main(String[] args) {
        //转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5
        System.out.println("=============");

        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("=============");

        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);//How do you do?
        System.out.println(str2);//H*w d* y*u d*?
        System.out.println("=============");
    }
}
