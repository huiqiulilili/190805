import java.util.Arrays;

public class Practice7 {
    public void bubbleSort(int[] array){
        for(int i = 0;i < array.length;i ++){
            for(int j = 0;j < array.length - 1 - i;j ++){
                if(array[j] > array[j + 1]){
                    int t;
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }

    public static int binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(array[mid] > key){
                right = mid - 1;
            }else if(array[mid] < key){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,4,6,7,5,3};
        Practice7 p = new Practice7();
        p.bubbleSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(binarySearch(array,5));

    }
}
