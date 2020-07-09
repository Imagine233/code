package day0709;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray ={10, 20, 30};
        //将int[ ]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[10, 20, 30]

        int[] array1 = {2, 5, 4, 1, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));//[1, 2, 4, 5, 6]

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa, bbb, ccc]
    }
}
