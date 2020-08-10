package day0810.demo03;

public class Demo03Integer {
    public static void main(String[] args) {
        //装箱
        Integer in1 = new Integer(1);
        System.out.println(in1);//1 重写了toString方法

        Integer in2 = new Integer("1");
        System.out.println(in2);//1

        //静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);//1

        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);//1

        //拆箱
        int i = in1.intValue();
        System.out.println(i);//1
    }
}
