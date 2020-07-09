package day0709;

public class Demo03MathPractise {
    public static void main(String[] args) {
        int count = 0;//符合要求的数量

        double min = -10.8;
        double max = 5.9;
        //这样处理，变量i就是区间之内所有的整数
        for(int i = (int) min; i < max; i++){
            int abs = Math.abs(i);//绝对值
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }
}
