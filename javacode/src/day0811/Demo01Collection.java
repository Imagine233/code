package day0811;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[ ] 重写了toString方法

        //把给定的对象添加到当前集合中
        boolean b1 = coll.add("艾斯");
        System.out.println("b1:" +b1);//b1:true
        System.out.println(coll);//[艾斯]
        coll.add("萨博");
        coll.add("路飞");
        coll.add("索隆");
        coll.add("乔巴");
        System.out.println(coll);//[艾斯, 萨博, 路飞, 索隆, 乔巴]

        //把给定对象再当前集合中删除
        boolean b2 = coll.remove("乔巴");
        System.out.println("b2:" + b2);//b2:true

        boolean b3 = coll.remove("山治");
        System.out.println("b3:" + b3);//b3:false
        System.out.println(coll);//[艾斯, 萨博, 路飞, 索隆]

        //判断当前集合中是否包含给定对象
        boolean b4 = coll.contains("路飞");
        System.out.println("b4:" + b4);//b4:true

        boolean b5 = coll.contains("娜美");
        System.out.println("b5:" + b5);//b5:false

        //判断当前集合是否为空
        boolean b6 = coll.isEmpty();
        System.out.println("b6:" + b6);//b6:false

        //返回集合中元素的个数
        int size = coll.size();
        System.out.println("size:" + size);//size:4

        //把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //清空结合中的所有元素，但是不删除集合，集合还存在
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true
    }
}
