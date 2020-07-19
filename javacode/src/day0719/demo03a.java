package day0719;

import static day0719.demo03a.Sum.func;

public class demo03a {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1;i <= 100;i++){
            sum = sum + func(i);
        }
        System.out.println(sum);

    }
    public static class Sum {
        public static double func(double a) {
            if (a % 2 == 0) {
                a = -(1 / a);
            } else {
                a = (1 / a);
            }
            return a;
        }
    }
}
