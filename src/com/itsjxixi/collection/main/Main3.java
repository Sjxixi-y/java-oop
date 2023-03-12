package com.itsjxixi.collection.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //List集合相对于Collection集合多了⼀些关于下标操作的⽅法
        //List集合的常⽤⽅法
        list.add("jack");
        list.add("rose");
        list.add("cxk");
        list.add("尼古拉斯");
        System.out.println(list);
        System.out.println("======================================");
        //在集合指定下标位置上添加元素 add(index, element)
        list.add(0, "李雷");
        list.add(3, "韩梅梅");
        list.add(6, "亚洲舞王");
        //list.add(10, "赵四"); 下标范围：0~size
        System.out.println(list);
        System.out.println("======================================");
        //清空集合中所有的元素 clear()
        //list.clear();
        //System.out.println(list);
        System.out.println("======================================");
        //返回元素在集合中的下标，如果不存在返回-1
        System.out.println(list.indexOf("cxk"));
        //返回元素在集合中的下标（找到集合中最后⼀个相同元素），如果不存在返回-1
        System.out.println(list.lastIndexOf("cxk"));
        System.out.println("======================================");
        //移除集合中指定下标位置上的元素 下标范围：0 ~ size-1
        list.remove(0);
        System.out.println(list);
        System.out.println("======================================");
        //修改集合中指定下标位置上的元素 下标范围：0 ~ size-1
        list.set(1, "李雷");
        System.out.println(list);
        System.out.println("======================================");
        //截取集合中指定下标开始到结束位置上的元素
        List<String> list1 = list.subList(2, 5);
        System.out.println("list1----》" + list1);
        System.out.println("======================================");
        //获取指定下标位置上的元素
        System.out.println(list.get(0));
    }
}
