public class Merge {

    private static void MergeSort(int[]initialArray) {
        int initialLength = initialArray.length;

        if (initialLength < 2) {
            return;
        }
        int midIndex = initialLength / 2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[initialLength - midIndex];

        //filling the divided arrays
        int i;
        for (i = 0; i < midIndex; i++) {
            leftArray[i] = initialArray[i];
        }

        int j;
        for (j = midIndex; j < initialLength; j++) {
            rightArray[j - midIndex] = initialArray[j];
        }

        //mergesorting the obtained Arrays

        MergeSort(rightArray);
        MergeSort(leftArray);

        //combining algorithm
        combine(initialArray, leftArray, rightArray);
    }

    private static void combine(int[] initialArray, int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int i = 0, j = 0, k = 0;

        while(i <= leftLength && j <= rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                initialArray[k] = leftArray[i];
                i++;
            }
            else {
                initialArray[k] = rightArray[j];
                j++;
            }
        }

        while (i < leftLength) {
            initialArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            initialArray[k] = rightArray[i];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] array = {5,8,2,45,32,56,78,49,21,89,51};

        System.out.println("Before Sorting");
        for (int arr : array) {
            System.out.print(arr + ", ");
        }

        MergeSort(array);


        System.out.println("After Sorting");
        for (int arr : array) {
            System.out.print(arr + ", ");
        }
    }
}
