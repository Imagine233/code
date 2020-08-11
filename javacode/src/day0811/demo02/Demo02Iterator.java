package day0811.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("虞书欣");
        coll.add("许佳琪");
        coll.add("喻言");
        coll.add("谢可寅");
        coll.add("孙芮");

        //多态   接口          实现类对象
        Iterator<String> it = coll.iterator();
        //判断还有没有下一个元素
        boolean b = it.hasNext();
        System.out.println(b);//true
        //取出集合中的下一个元素

        //使用迭代器取出集合中元素的代码，是一个重复代过程，可以使用循环优化
        //不知道集合中有多少元素，使用while循环，循环结束的条件，hasNext方法返回false

        while (it.hasNext()){
            String s1 = it.next();
            System.out.println(s1);
        }

        System.out.println("============");
        for(Iterator<String> it2 = coll.iterator(); it2.hasNext();){
            String s2 = it2.next();
            System.out.println(s2);
        }
        /*
        String s = it.next();
        System.out.println(s);//虞书欣

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//许佳琪

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//喻言

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//谢可寅

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//孙芮

        b = it.hasNext();
        System.out.println(b);//false
        */
    }
}
