public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {77,21,16,84,12,46,26};
        int temp = 0;
        int minIndex = 0;
        int length = arr.length;

        //printing the array before sorting
        System.out.println("Array before sorting");
        for (int num: arr) {
            System.out.print(num + ", ");
        }


        for (int i = 0; i < length; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if ( arr[minIndex] > arr[j] ) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


        System.out.println();
        System.out.println("Array after sorting");
        for (int num: arr) {
            System.out.print(num + ", ");
        }



    }
}







// public class SelectionSort {

//     public static void main(String[] args) {
//         // int nums[] = {8,4,54,22,16,12,43,9,33,56};
//         int nums[] = {6, 77, 28, 41, 8, 24};
//         int size = nums.length;
//         int temp = 0;
//         int minIndex = -1;

//         System.out.println("Values before sorting");
//         for (int num : nums) {
//             System.out.print(num + ", ");
//         }

       
//         for (int i=0; i<size-1; i++) {
//             minIndex = i;
//             for(int j=i+1; j<size;j++) {
//                 if (nums[minIndex] > nums[j]){
//                     minIndex = j;
//                 }
//             }
//             temp = nums[minIndex];
//             nums[minIndex] = nums[i];
//             nums[i] = temp;

//             System.out.println();

//             for(int num : nums) {
//                 System.out.print(num + ", ");
//             }
//         }


//         System.out.println();
//         System.out.println("Values after sorting");
//         for (int num : nums) {
//             System.out.print(num + ", ");
//         }
//     }
// }
