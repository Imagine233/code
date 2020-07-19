package day0719;

public class demo01a {
    public static void main(String[] args) {
            for(int i=1;i<=9;i++) {
                for (int j = 1; j <= i; j++) {            //j<=i是确保列小于或等于行数
                    System.out.print(i + "x" + j + "=" + i * j+'\t'); //'\t'的意思是强制水平制表
                }
                System.out.println();   //这一行的意思循环结束就换行
            }
    }
}

