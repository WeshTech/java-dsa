public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {3,5,8,12,15,17,35,43,56,78,99};
        int target = 43;
        int result = binarySearch(array, target);

        if (result > 0) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Number not Found!: ");
        }

    }

    private static int binarySearch(int[] numbers, int numberToFind){
        int low = 0;
        int high = numbers.length - 1;

        while(low <= high) {
            int midddlePosition = (low + high) / 2;
            int middleNumber = numbers[midddlePosition];

            if (numberToFind == middleNumber) {
                return midddlePosition;
            }
            if (numberToFind < middleNumber) {
                high = midddlePosition + 1;
            } else {
                low = midddlePosition + 1;
            }
        }

        return -1;
    }
}
