package day0809.demo02;

import java.util.Arrays;

public class Demo02System02 {
    public static void main(String[] args) {
        demo02();
    }

    private static void demo02() {
        //定义源数组
        int[] src = {1, 2, 3, 4, 5};
        //定义目标数组
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：" + Arrays.toString(dest));//复制前：[6, 7, 8, 9, 10]
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后：" + Arrays.toString(dest));//复制后：[1, 2, 3, 9, 10]
    }
}
