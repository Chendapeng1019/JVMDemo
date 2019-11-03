package jvm;

/**
 * @ClassName Test01
 * @Description
 * @Author chendapeng
 * @Date 2019/10/27
 **/
public class Test01 {
    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.test1();
    }
}

class Test02{
    void test1(){
        Integer i = 1;
        Boolean b = false;
        String s = "hello";
        Test03 test03 = new Test03();
        test03.setA("test03-a");
        test03.setJ(false);

        test02(i,b,s,test03);

        System.out.println("i="+i);
        System.out.println("b="+b);
        System.out.println("s="+s);
        System.out.println(test03);

    }

    private void test02(Integer i, Boolean b, String s, Test03 test03) {
        i = 2;
        b= true;
        s = "world";
        test03.setA("test03-b");
        test03.setJ(true);
    }

}

class Test03{
    String a ;
    Boolean j;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Boolean getJ() {
        return j;
    }

    public void setJ(Boolean j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Test03{" +
                "a='" + a + '\'' +
                ", j=" + j +
                '}';
    }
}


