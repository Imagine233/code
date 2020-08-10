package day0810.demo03;

import java.util.ArrayList;

public class Demo03Integer2 {
    public static void main(String[] args) {
        //自动装箱
        //Integer in = 1 ; 就相当于 Integer in = new Integer (1);
        Integer in = 1;

        //自动拆箱
        //in + 2;就相当于 in.intValue() + 3 = 3;
        //in = in + 2;就相当于 in = new Integer (3)自动装箱
        in = in + 2;
        System.out.println(in);//3

        //ArrayList集合无法直接存储整数，可以存储Integer包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱 list.add(new Integer(1));
        int a = list.get(0);//自动拆箱 list.get(0).intValue();

    }
}
