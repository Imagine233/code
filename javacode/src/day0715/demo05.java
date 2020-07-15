package day0715;

//输出1000-2000之间所有的闰年
public class demo05 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            if (i % 4 == 0){
                System.out.println(i + "年是闰年");
            }
        }
    }
}
