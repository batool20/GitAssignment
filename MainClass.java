import java.util.Arrays;
public class MainClass {
    public static void main(String[] args) {

        MergeSort3way Merge2= new MergeSort3way();
	

        MergeSort3way Merge = new MergeSort3way();

        int[] numbers = {4, 2, 7, 1, 9, 5, 3, 8, 6};

        System.out.println("Array before sorting: " + Arrays.toString(numbers));  
        insertionSort(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
    }
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }



    }
    
}
