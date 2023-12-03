
public class MainClass {
    public static void main(String[] args) {
<<<<<<< HEAD
        MergeSort3way Merge2= new MergeSort3way();
	
=======
        MergeSort3way Merge = new MergeSort3way();
>>>>>>> 59550ccb75373caab21cb36e687e3a811d59166c
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
}
