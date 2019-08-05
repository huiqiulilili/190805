import java.util.Arrays;
public class SeqList {
    private int[] array;
    private int size;

    //构造方法
    public SeqList(){
        array = new int[11];
        size = 0;
    }

    //支持的方法
    //头插
    public void pushFront(int element){
        ensureCapacity();
        for(int i = size - 1;i >= 0;i --){
            array[i + 1] = array[i];
        }
        array[0] = element;
        size++;
    }

    //尾插
    public void pushBack(int element){
        ensureCapacity();
        array[size] = element;
        size++;
    }

    //中间插入
    public void insert(int index,int element){
        ensureCapacity();
        for(int i = size - 1;i >= index;i --){
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    //头删
    public void popFront(){
        if(size == 0){
            System.out.println("空链表，无法删除");
        }
        for(int i = 0;i < size - 1;i ++){
            array[i] = array[i + 1];
        }
        size--;
        array[size] = 0;
    }

    //尾删
    public void popBack(){
        if(size == 0){
            System.out.println("空链表，无法删除");
        }
        array[--size] = 0;
    }

    // 查找
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }
    //根据下标删
    public void erase(int index){
        for(int i = index;i < size - 1 ;i ++){
            array[i] = array[i + 1];
        }
        array[--size] = 0;
    }

    // 给定下标，修改下标所在元素的值
    public void set(int index, int element) {
        array[index] = element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int capacity() {
        return array.length;
    }

    // 便于打印，显示顺序表中已有元素
    public String toString() {
        return Arrays.toString(
                Arrays.copyOf(array, size)
        );
    }

    public void remove(int element) {
        int index = indexOf(element);
        if (index != -1) {
            erase(index);
        }
    }

    public void removeAll(int element) {
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != element) {
                array[j++] = array[i];
            }
        }
        size = j;
    }

    //内部方法
    //扩容
    private void ensureCapacity(){
        if(size < array.length){
            return;
        }
        int newCapacity = array.length + array.length / 2;
        int[] newArray =  new int[newCapacity];
        for(int i = 0;i < array.length;i ++){
            newArray[i] = array[i];

        }
        this.array = newArray;

    }

    //测试
    public static void test1(String[] args){
        SeqList seqList = new SeqList();
        System.out.println(seqList.toString());
        // 尾插 1 2 3
        seqList.pushBack(1);
        seqList.pushBack(2);
        seqList.pushBack(3);
        // [ 1, 2, 3 ]
        System.out.println(seqList.toString());
        // 头插 10 20 30
        seqList.pushFront(10);
        seqList.pushFront(20);
        seqList.pushFront(30);
        // [ 30, 20, 10, 1, 2, 3 ]
        System.out.println(seqList.toString());
        seqList.insert(2, 100);
        seqList.insert(4, 200);
        // [ 30, 20, 100, 10, 200, 1, 2, 3 ]
        System.out.println(seqList.toString());
        System.out.printf("当前容量: %d%n", seqList.capacity());
        seqList.pushBack(1000);
        seqList.pushBack(2000);
        seqList.pushBack(3000);
        seqList.pushBack(4000);
        seqList.pushBack(5000);
        seqList.pushBack(6000);
        System.out.printf("当前容量: %d%n", seqList.capacity());
        seqList.popFront();
        seqList.popFront();
        seqList.popFront();
        seqList.popFront();
        // [ 200, 1, 2, 3 ]
        System.out.println(seqList.toString());
        seqList.popBack();
        seqList.popBack();
        seqList.popBack();
        // [ 200 ]
        System.out.println(seqList.toString());
    }

    public static void test2(String[] args) {
        SeqList s = new SeqList();
        s.pushBack(1);
        s.pushBack(2);
        s.pushBack(3);
        s.pushBack(4);
        s.pushBack(1);
        s.pushBack(2);
        s.pushBack(3);
        s.pushBack(4);
        // [ 1, 2, 3, 4, 1, 2, 3, 4 ]
        System.out.println(s.toString());
        s.remove(2);
        // [ 1, 3, 4, 1, 2, 3, 4 ]
        System.out.println(s.toString());
        s.removeAll(4);
        // [ 1, 3, 1, 2, 3 ]
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        test1(args);
        test2(args);
    }
}
