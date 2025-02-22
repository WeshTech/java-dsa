public class BubbleSort {

    public static void main(String[] args) {
        // int nums[] = {8,4,54,22,16,12,43,9,33,56};
        int nums[] = {6, 77, 28, 41, 8, 24};
        int size = nums.length - 1;
        int temp = 0;

        System.out.println("Values before sorting");
        for (int num : nums) {
            System.out.print(num + ", ");
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size - i; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

            //print to see the process
            System.out.println();
            for (int num : nums) {
                System.out.print(num + ", ");
            }
        }


        System.out.println();
        System.out.println("Values after sorting");
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }
}
