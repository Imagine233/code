package day0806.demo02;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("徐睿知",18);
        Person p2 = new Person("宋智孝",18);

        boolean b = p1.equals(p2);
        System.out.println(b);//false
    }
}
