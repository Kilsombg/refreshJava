package Utility;

public class ArrayUtility {
    /**
     * Swapping the value of the elements at index1 and index2 of the array
     * @param a the array contained the elements to be swapped
     * @param index1 index of the first element
     * @param index2 index of the second element
     * @param <T> type of the elements in the array
     */
    public static <T> void swap(T[] a, int index1, int index2) {
        T temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    // generate random array by given size

    /**
     * Returns the maximum element from the array
     * @param a the array
     * @return Return the maximum element from the array
     */
    public static int maximumNumber(int[] a){
        int max = a[0];
        for(int i=1; i<a.length;i++){
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    /**
     * Return the minimum element from the array
     * @param a the array
     * @return Return the minimum element from the array
     */
    public static int minimumNumber(int[] a){
        int min = a[0];
        for(int i=1; i<a.length;i++){
            if(min > a[i])
                min = a[i];
        }
        return min;
    }

    /**
     * Average value of the array
     * @param a the array
     * @return Average value of the array
     */
    public static float average(int[] a){
        // sum
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return (float) sum / a.length;
    }
}
