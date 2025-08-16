1. Iterative Approach
public class Q1_BinarySearchIterative {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // prevent overflow

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in array.");
    }
}

2. Recursive Approach
public class Q2_BinarySearchRecursive {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // base case: not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // found
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target); // right half
        } else {
            return binarySearch(arr, left, mid - 1, target);  // left half
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in array.");
    }
}

Output:
Element found at index: 2

