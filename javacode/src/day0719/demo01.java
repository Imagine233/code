package day0719;
//输出乘法口诀表
public class demo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + '\t');
            }
            System.out.println();
        }
    }
}
