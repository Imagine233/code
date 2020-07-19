package day0719;
//编写程序数一下1-100之间的所有整数中出现多少个数字9
public class demo04 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9){//余数等于9，如9,19，..
                count++;
                System.out.println(i + "中带数字9");
            }else if(i / 10 == 9){//商等于9，如90,91，..
                count++;
                System.out.println(i + "中带数字9");
            }
        }
        System.out.println("1-100中带数字9的个数是：" + count);
    }
}
