package day0720.demo03;

public class Demo03Main {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerON();

        //准备一个鼠标供电脑使用
//        Mouse mouse = new Mouse();
        //首先进行向上转型
        USB usbMouse = new Mouse();
        //参数是USB类型，正好传递进去就是USB鼠标
        computer.useDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        computer.useDevice(keyboard);//方法参数是USB类型，传递进去的是实现类对象

        computer.powerOff();
    }
}
