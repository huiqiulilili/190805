class Person{
    String name;
    int age;
     Person(){}
     Person(String n,int a){
         System.out.print(n);
         name = n;
         age = a;
     }
     void print(){
         System.out.printf("name = %s    age = %d",name,age);
     }
}
public class Practice3 {
    public static void main(String[] args) {
        Person personNull = null;

        Person person = new Person();
        person.age = 18;
        person.name = "藏三三";
        person.print();

        Person person1 = new Person("小明",19);
        person1.print();
    }
}
