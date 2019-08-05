import java.util.Arrays;
 class Practice {
    public static void intiArray(){
        printArray(new int[]{1,2,3,4,5});
        int[] array = null;
        array = new int[10];
        for(int i = 0;i < 10;i ++){
            array[i] = i;
        }
        printArray(array);
    }

    public static void printArray(int[] array){
        for(int item:array){
            System.out.print(item);
        }

        for(int i = 0; i< array.length;i ++){
            System.out.print(array[i]);
        }
    }

    public static void method1(int[] array){
        array = new int[10];
        for(int i = 0;i < array.length;i ++){
            array[i] = 100 + i;
        }
    }

    public static void method2(int[] array){
        array[0] = 2019;
    }

    public static void testCopyArray(){
        /***
         * 完全复制了一份，
         * 分别指向了不同的数组
         * 互不影响
         */
        int[] srcArray = {1,2,3,4,5,};
        int[] destArray = Arrays.copyOf(srcArray,srcArray.length);
        destArray[0] = 2019;
        System.out.print(srcArray[0]);
        /****
         * 只是copy了引用
         * 指向相同的数组
         * 互相影响
         */

        int[] destRefArray = srcArray;
        destRefArray[0] = 20190805;
        System.out.print(srcArray[0]);
        /**
         * 利用 System.arraycopy 进行数组复制
         */
        int[] destSystemArray = new int[srcArray.length];
        System.arraycopy(srcArray,0,destSystemArray,0,srcArray.length);
        System.out.print(Arrays.toString(destSystemArray));


    }

     /**
      * 初始值为0
      */
    public static void testDefaultValue(){
        int[] array;
        array = new int[10];
        System.out.print(Arrays.toString(array));
    }

    public static void main(String[] args) {
        //intiArray();
//        int[] array = { 1, 2, 3, 4, 5 };
//        System.out.println(Arrays.toString(array));
//        method1(array);
//        System.out.println(Arrays.toString(array));
//        method2(array);
//        System.out.println(Arrays.toString(array));
        testCopyArray();
        testDefaultValue();
    }
}
