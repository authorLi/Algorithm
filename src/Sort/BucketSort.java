package Sort;

public class BucketSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,5,3,8};
        bucketSort(arr, 1001);
    }

    public static void bucketSort(int[] array,int n){
        int[] bucket = new int[n];
        for(int i = 0;i < array.length;i++){
            bucket[array[i]] ++;
        }
        for(int i = 0;i < bucket.length;i++){
            if(bucket[i] != 0){
                for(int j = 0;j < bucket[i];j++){
                    System.out.println(i);
                }
            }
        }
    }

}
