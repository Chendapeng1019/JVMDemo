package jvm;

/**
 * @ClassName MyTest5
 * @Description
 * @Author chendapeng
 * @Date 2019/11/2
 **/

import java.util.Random;

/**
 *  当一个接口初始化的时候，并不要求其父接口都完成了初始化
 *  只有在真正使用到父接口的时候（如引用接口中定义的常量时），才会初始化
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    public static final int a = 5;
}

interface MyChild5 extends MyParent5 {
    public static final   int b =new Random().nextInt(2);
}