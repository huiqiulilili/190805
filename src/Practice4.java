class Group{
    String name;
    int num;
    Group(String n,int m){
        name = n;
        num = m;
    }
    Group(){}

    public void print(String welcom){
        System.out.printf("%s %s 的 %d 位同学%n",welcom,name,num);
    }
}

class B{
    int sum;
     B(int a,int b,int c){
         System.out.print(a + b + c);
         sum = a + b + c;
     }
     void print(){
         System.out.println(sum);
     }
}
public class Practice4 {

    public static void main(String[] args) {
        Group group = new Group("清华",1000);
        group.print("欢迎来到清华，");

        B b = new B(1,2,3);
        b.print();

    }
}
