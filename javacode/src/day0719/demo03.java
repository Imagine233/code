package day0719;
//计算1/1-1/2+1/3-1/4+1/5.......+1/99-1/100的值
public class demo03 {
    public static void main(String[] args) {
        double sum = 0.0;
        double a = 1.0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum - (a / i);
            } else {
                sum = sum + (a / i);
            }
        }
        System.out.println(sum);//0.688172179310195
    }
}
