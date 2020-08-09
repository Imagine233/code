package day0809.demo02;

public class Demo02System {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        //程序执行前，获取一次毫秒值
        long s = System.currentTimeMillis();

        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        //创新执行后，再获取一次毫秒值
        long s1 = System.currentTimeMillis();
        System.out.println("程序共耗时：" + (s1 - s) + "毫秒");//62毫秒
    }
}
