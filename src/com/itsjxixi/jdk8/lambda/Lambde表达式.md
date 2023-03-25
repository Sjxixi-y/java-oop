# Lambde

`JDK8`的新特性。

用于函数式接口，快捷的编写匿名内部类。让代码像数据一样传递。



## 使用：

```java
// 语法格式一：无参、无返回值
Runnable r2 = () -> {
    System.out.println("我爱长沙臭豆腐");
};

// 语法格式二：Lambda需要一个参数、无返回值
Consumer<String> con2 = (String s) -> {
    System.out.println(s);
};

// 语法格式三：数据类型可以省略，因为可由编译器推断得出，称为"类型推断"
Consumer<String> con3 = (str) -> {
    System.out.println(str);
};

// 语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
Consumer<String> con4 = str -> {
    System.out.println(str);
};

// 语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
Comparator<Integer> com2 = (o1, o2) -> {
    //多条执行语句
    System.out.println(o1);
    System.out.println(o2);
    return Integer.compare(o1, o2);
};

// 语法格式六：当Lambda体只有一条语句时，return 与 大括号若有，都可以省略
Comparator<Integer> com3 = (o1, o2) -> Integer.compare(o1, o2);
```



## 入门

示例1：当只有一条语句的时候。

```java
public static void main(String[] args) {
    Runnable ru = new Runnable() {
        @Override
        public void run() {
            System.out.println("我是线任务");
        }
    };

    // 1. 去掉方法签名，只留下具体语句。
    Runnable ru1 = () -> {
        System.out.println("我是线任务");
    };

    // 2. 对于只有一条执行语句的情况，可以省略参数。
    Runnable ru2 = () -> System.out.println();
}
```

Demo1



示例2：当出现返回值的时候。

```java
public static void main(String[] args) {
    Function<Integer, Integer> f = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer i1) {
            return i1 + 1;
        }
    };

    // 1. 去掉方法签名，只留下具体语句。
    Function<Integer, Integer> f1 = (i1) -> {
        return i1 + 1;
    };

    // 2. 对于只有一条执行语句的情况，可以省略参数、return。并且只有一个参数，参数的括号也可以被删除。
    Function<Integer, Integer> f2 = i1 -> i1 + 1;
}
```

Demo2



## 函数式接口

如果一个接口中只声明了一个方法，则称之为 **函数式接口** 。



### 注解检测：

```java
// 检测接口是否满足函数式接口。
@FunctionalInterface
```



### **用法：**

测试类;

```
public class Demo1 {
    public static void main(String[] args) {
        Usb u1 = () -> System.out.println("使用了电脑USB");
        Usb u2 = () -> System.out.println("使用了手机USB");

        run(u1);
        run(u2);

    }

    public static void run(Usb usb) {
        usb.service();
    }
}
```

自定义函数接口类

```
@FunctionalInterface
public interface Usb {
    void service();
}
```

**路径：**src/com/itsjxixi/jdk8/main/lambda/demos/demos1



### 常见函数式接口

官方创建的各种常见的接口类型，涵盖了大部分接口的类型。



#### 1.消费型接口

有参数无返回值

```java
Consumer<T> // 入参为 T
```



演示：

```java
public static void main(String[] args) {
    // 1.传入处理方式
    Consumer<Double> c = a -> System.out.println("消费：" + a);
    happy(c, 200000.0);
    // 2.传入处理方式
    happy(a -> System.out.println("收入：" + a), 200000.0);
}

public static void happy(Consumer<Double> c, Double a) {
    c.accept(a);
}
```

**路径：**src/com/itsjxixi/jdk8/main/lambda/Demo4.java



#### 2.供给型接口

无参有返回

```java
Supplier<T> // 返回值为 T
```



演示：

```java
public class Demo5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> new Random().nextInt(100);

        int[] arr = getArr(s, 10);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArr(Supplier<Integer> s, int index) {
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            arr[i] = s.get();
        }
        return arr;
    }
}
```

**路径：**src/com/itsjxixi/jdk8/main/lambda/Demo5.java



#### 3.函数型接口

有参有返回

```java
Function<T,R> // 入参为T，返回值为 R
```



演示：

```java
public static void main(String[] args) {
    Function<String, String> f = str -> str.toUpperCase();

    System.out.println(handlerString(f, "abcde"));
}

public static String handlerString(Function<String, String> f, String str) {
    return f.apply(str);
}
```

**路径：**src/com/itsjxixi/jdk8/main/lambda/Demo6.java



#### 4.断定型接口

有参有返回值（ boolean 类型）

```java
Predicate<T> // 入参为 T
```



演示：

```java
public class Demo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("张学友");
        list.add("张无忌");
        list.add("迪丽热巴");
        list.add("刘亦菲");
        // 以 张 开头
        Predicate<String> p1 = s -> s.startsWith("张");
        // 第二个是 学
        Predicate<String> p2 = s -> s.startsWith("学", 1);
        // 长度是 3
        Predicate<String> p3 = s -> s.length() == 3;

        List<String> strings = filterNames(p3, list);
        System.out.println(strings);
    }

    public static List<String> filterNames(Predicate<String> p, List<String> list) {
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (p.test(s)) {
                list2.add(s);
            }
        }
        return list2;
    }
}
```

**路径：**src/com/itsjxixi/jdk8/main/lambda/Demo7.java



#### 5.操作型接口

无参无返回

```java
Runnable
```



演示：

```java
public class Demo8 {
    public static void main(String[] args) {
        // 打印分隔符
        Runnable r = () -> System.out.println("-------------------");

        r.run();
    }
}
```



# 方法引用

方法引用是Lambda表达式的一种简写形式。 如果Lambda表达式方法体中只是调用一个特定的已经存在的方法，则可以使用方法引用。（有点抽象）



## 1.对象::实例形式

如果Lambda表达式中只调用了一个方法，比如：println()，并且这个方法的特点和接口方法 void accept(T t) 的特点是一样的,比如 **有一个参数，没有返回值**，那么这种情况下可以使用方法引用。



演示：











