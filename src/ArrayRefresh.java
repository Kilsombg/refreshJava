import java.util.Arrays;

public class ArrayRefresh {
    public static void main(String[] args) {
        String a = "Hello";
        a = a.concat(" World");
        System.out.println(a);
    }

    private void printArray() {
        float[][] array = {
                {1f, 2f, 3f, 4f, 5f}
        };

        System.out.println(Arrays.toString(array));
    }

    private static void copyArray() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArray = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(newArray));
    }

    


    public static int maxArray(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }

        return max;
    }

    public static int[] maxArray(int arr[], int count){
        int[] result = new int[count];

        for(int i=0; i<count; i++){
            result[i] = arr[i];
        }

//        for(int i=0; )

        return result;
    }
}