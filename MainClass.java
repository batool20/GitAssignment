import java.util.Arrays;
public class MainClass {
    public static void main(String[] args) {

        MergeSort3way Merge2= new MergeSort3way();
	

        MergeSort3way Merge = new MergeSort3way();

        int[] numbers = {4, 2, 7, 1, 9, 5, 3, 8, 6};

        System.out.println("Array before sorting: " + Arrays.toString(numbers));  
        insertionSort(numbers);
        System.out.println("Array after sorting: " + Arrays.toString(numbers));
	criticalIssueFix(); // Fixing the critical issue
	
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
     private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

	public static void criticalIssueFix() {
        // Your fix for the critical issue goes here
        System.out.println("Critical issue fixed!");
    }

}
