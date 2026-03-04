public class FloorSearch {
    public static int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int floor = -1; // Default if no floor exists (e.g., x is smaller than all elements)

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return arr[mid]; // Exact match is the best possible floor
            }

            if (arr[mid] < x) {
                // Potential floor found, but let's look for a closer (larger) one to the right
                floor = arr[mid];
                low = mid + 1;
            } else {
                // Too big, look to the left
                high = mid - 1;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        int result = findFloor(arr, x);
        
        if (result != -1) {
            System.out.println("Floor of " + x + " is: " + result);
        } else {
            System.out.println("No floor found for " + x);
        }
    }
}
