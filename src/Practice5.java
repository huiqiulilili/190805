class Person5{
    private String name;
    private int age;

    //静态属性
    public static int createdCount;

    public Person5(String name,int age){
        createdCount++;
        System.out.printf("Person(%s , %d)%n",name,age);
        this.name = name;
        this.age = age;
    }
    public Person5(){
        this("清华学生",18);
        System.out.printf("Person()%n");
    }

    public void print(){
        Person5.printPerson(this);
    }

    public static void printPerson(Person5 person5){
        System.out.printf("Person{name = %s ,age = %d}%n",person5.name ,person5.age);
    }
}
public class Practice5 {
    public static void main(String[] args) {
        System.out.println(Person5.createdCount);
        Person5 p1 =  new Person5();
        p1.print();
        System.out.println(Person5.createdCount);
        new Person5("北大",20).print();
        System.out.println(Person5.createdCount);

    }
}

/**
 * 0
 * Person(清华学生 , 18)
 * Person()
 * Person{name = 清华学生 ,age = 18}
 * 1
 * Person(北大 , 20)
 * Person{name = 北大 ,age = 20}
 * 2
 */
