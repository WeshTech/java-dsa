public class MergeSort {
    public static void main(String[] args) {
        int [] numbers = {5,88,43,90,12,75,34};

        System.out.println("Before Sorting");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }


        mergeSort(numbers);
        

        System.out.println("\nAfter Sorting");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(rightHalf);
        mergeSort(leftHalf);

        //code to merge
        merge(inputArray, leftHalf, rightHalf);

    }

    private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while ( i < leftSize ) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }


}
