class A{
    A(String title){
        System.out.println(title);
    }
}
public class Practice6 {

    static A staticA = new A("静态属性-定义时初始化");

    A a = new A("定义时初始化");


    {
        a = new A("构造代码块中初始化");
    }

    Practice6(){
        a = new A("构造方法中初始化");
    }


    static {//1
        staticA = new A("静态属性-静态代码块 1 初始化");
    }

    public static void main(String[] args) {
        Practice6 c1 = new Practice6();
        Practice6 c2 = new Practice6();

    }


    static {//2
        staticA = new A("静态属性-静态代码块 2 初始化");
    }
}
