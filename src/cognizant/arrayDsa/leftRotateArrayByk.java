package cognizant.arrayDsa;

public class leftRotateArrayByK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;

        // Using the reverse method approach
        rotateLeftByD(arr, n, k);

        System.out.print("Array after left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Reset array to original state
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        // Using the temporary array approach
        rotateToLeft(arr2, k);

        System.out.print("Array after left rotation (temp array): ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    // Left rotate by reversing parts of the array
    public static void rotateLeftByD(int[] arr, int n, int k) {
        k = k % n; // Handle cases where k > n
        if (k == 0) return; // No need to rotate if k is 0

        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    // Helper method to reverse array between two indices
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) { // Only swap when start < end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left rotate by using a temporary array
    public static void rotateToLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        int[] temp = new int[k];

        // Copy first k elements to temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Shift remaining elements to the left
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        // Copy temp elements back to the end of arr
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }
    }
}
