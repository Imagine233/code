package day0707;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("路飞",19);
        one.room = "101教室";
        System.out.println("姓名:" + one.getName() + ",年龄：" + one.getAge() +
                ",教室：" + one.room + "，学号：" + one.getId());

        Student two = new Student("艾斯",21);
        System.out.println("姓名:" + two.getName() + ",年龄：" + two.getAge() +
                ",教室：" + two.room + "，学号：" + two.getId());

    }
}
