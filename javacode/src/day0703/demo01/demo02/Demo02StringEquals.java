package day0703.demo01.demo02;

public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("Hello"));//true
        System.out.println("Hello".equals(str2));//true
        System.out.println("===================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//false,严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true，忽略大小写
    }
}
