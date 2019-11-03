package jvm;

/**
 * @ClassName MyTest4
 * @Description
 * @Author chendapeng
 * @Date 2019/10/29
 **/
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4 parent4 = new MyParent4();
        MyParent4 parent41 = new MyParent4();
    }
}

class MyParent4{
    static {
        System.out.println("MyParent4 static block");
    }

    public MyParent4() {
        System.out.println("hello world");
    }
}
