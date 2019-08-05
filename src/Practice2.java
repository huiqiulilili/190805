import java.util.Arrays;

public class Practice2 {

    public static int max(int[] array){
        int max = array[0];
        for(int item:array){
            if(item > max){
                max = item;
            }
        }
        return max;
    }

    public static int indexOf(int[] array,int key){
        for(int i = 0;i < array.length;i ++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static double average(int[] array){
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for(int item:array){
            if(item > max){
                max = item;
            }
        }
        for(int item:array){
            if(item < min){
                min = item;
            }
        }

        for(int i = 0;i < array.length;i ++){
            sum = sum + array[i];
        }
        return (double) (sum - max - min) / (array.length - 2);
    }

    //二分查找
    public static int binarySearch(int[] array,int key){
        int left = array[0];
        int right = array[array.length - 1];
        while(left < right){
            int mid = left + (right - left) / 2;
            if(array[mid] > key){
                right = mid - 1;
            }else if(array[mid] < key){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void swap(int[] array,int i,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void bubbleSort(int[] array){
        for(int i = 0 ; i < array.length;i ++){
            boolean isSwapped = false;
            for(int j = 0;j < array.length - 1- i;i ++){
                if(array[j] > array[j + 1]){
                    swap(array,j ,j + 1);
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                return;
            }
        }
    }

    public static void testPrint() {
        System.out.print("中国人");
        System.out.print(1);
        System.out.print("中国人 " + 1);

        System.out.println();

        System.out.printf("我是中国人 %d %d%n", 1, 2);
        System.out.format("我是中国人 %d %d%n", 1, 2);
    }

    public static void main(String[] args) {
//        int[] array = new int[]{1,2,3,4,5,6,8,9};
//        int max = max(array);
//        System.out.print("最大值为" + max);
//
//        System.out.print("下标为" + indexOf(array,5));
//        System.out.print("下标为" + indexOf(array,100));
//        System.out.print("平均值为" + average(array));
//        System.out.print("二分查找结果"+ binarySearch(array,6));
//        System.out.print(Arrays.toString(Arrays.copyOf(array,3)));
        testPrint();

    }
}
