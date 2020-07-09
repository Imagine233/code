package day0709;

import java.util.Arrays;

public class Demo01ArraysPractise {
    public static void main(String[] args) {
        String str = "nfbw0tkx21afw08ew";
        //如何进行升序排列：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String--->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对字符数组进行升序排列

        //需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);//xwwwtnkffeba82100
        }
    }
}
