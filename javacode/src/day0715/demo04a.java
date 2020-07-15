package day0715;

//打印1-100之间所有的素数
public class demo04a {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int num = i;
            for (int j = 2; j <= num; j++) {
                if (num % j == 0 && j != num) {
                    break;
                } else if (j == num) {
                    System.out.println(num + "是素数");
                }
            }
        }
    }
}
