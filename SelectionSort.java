public class SelectionSort {

    public static void main(String[] args) {
        // int nums[] = {8,4,54,22,16,12,43,9,33,56};
        int nums[] = {6, 77, 28, 41, 8, 24};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Values before sorting");
        for (int num : nums) {
            System.out.print(num + ", ");
        }

       
        for (int i=0; i<size-1; i++) {
            minIndex = i;
            for(int j=i+1; j<size;j++) {
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();

            for(int num : nums) {
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
