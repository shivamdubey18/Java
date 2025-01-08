import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Step 2: Create an array of the given size
        int[] arr = new int[n];

        // Step 3: Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // // Step 4: Print the array elements
        // System.out.print("Array elements are: ");
        // for (int num : numbers) {
        //     System.out.print(num + " ");
        // }

        //Find Max And Min in array 
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int n = scanner.nextInt();
        
        // int[] arr = new int[n];

        // System.out.println("Enter "+ n + " elements : ");
        // for(int i=0;i<n;i++){
        //     arr[i]= scanner.nextInt();
        // }

        // int max= arr[0];
        // for (int i=1;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // System.out.print("Maximum Element is : " + max);


        //Reversing an array
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter size of an array : ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // System.out.print("Enter "+ n + " elements : ");
        // for(int i = 0; i < n ; i++){
        //     arr[i] =  sc.nextInt();
        // }

        // for(int i = 0; i <n/2 ; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-i-1];
        //     arr[n-i-1] = temp;
        // }

        // System.out.print("Array elements are: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // System.out.print("Reversed arrays is : "+ Arrays.toString(arr));


        // Sum of all elements in array
        // System.out.println("Sum of elements: " + sumArray(arr));

        //Linear Search
        // System.out.print("Enter Element to Search : ");
        // int target = scanner.nextInt();
        // System.out.print("Element Found at index : "+ linearSearch(arr, target));
    }
    // Sum of Array Elements
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Linear Search 
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    {/* Binary Search*/}

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    {/*BUbble Sort*/}
    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < n ;i++){
            for(int j=0; j< n;j++){
                if(arr[])
            }
        }
    }
}
