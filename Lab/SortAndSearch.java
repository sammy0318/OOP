import java.util.Scanner;

class SortAndSearch {
    public static void main(String[] args) {
        int[] nums = {15, 35, 85, 74, 26, 19, 44, 14, 52, 12};

        Boolean swapMade = true;
        
        while (swapMade) {
            int temp;
            for (int i = 0; i < nums.length; i++) {
                swapMade = false;
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        swapMade = true;
                    }
                }
            }
        }
        System.out.print("The sorted array is: ");

        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int find = sc.nextInt();

        for (int l = 0; l < nums.length; l++) {
            if (nums[l] == find) {
                System.out.println("Element found at " + l + " index");
                break;
            }
        }
    }
}
