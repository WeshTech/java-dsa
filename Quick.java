public class Quick {

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        //choosing a pivot

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer ++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static void swap(int [] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void main(String[] args) {
        int array[] = {5,32,12,56,8,76,59,66,18};
        int length = array.length;

        System.out.println("Before Sorting");
        for (int arr : array) {
            System.out.print( arr + ", ");
        }


        quicksort(array, 0, length - 1);


        System.out.println();
        System.out.println("After Sorting Sorting");
        for (int arr : array) {
            System.out.print( arr + ", ");
        }
    }
}
