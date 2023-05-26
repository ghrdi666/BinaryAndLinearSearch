public class App {

        public static int binarySearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2; // Temukan indeks tengah
    
                if (arr[mid] == target) {
                    return mid; // Target ditemukan, kembalikan indeks
                } else if (arr[mid] < target) {
                    low = mid + 1; // Target berada di setengah kanan, perbarui batas bawah
                } else {
                    high = mid - 1; // Target berada di setengah kiri, perbarui batas atas
                }
            }
    
            return -1; // Target tidak ditemukan
        }
    
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Target ditemukan, kembalikan indeks
                }
            }
            return -1; // Target tidak ditemukan
        }
    
        public static void main(String[] args) {
            int[] array = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 23, 25, 29, 30, 35, 38, 45 };
            int target = 23;
    
            // Binary Search
            int binarySearchResult = binarySearch(array, target);
            if (binarySearchResult != -1) {
                System.out.println("Element found at index " + binarySearchResult + " (Binary Search)");
            } else {
                System.out.println("Element not found in the array (Binary Search)");
            }
    
            // Linear Search
            int linearSearchResult = linearSearch(array, target);
            if (linearSearchResult != -1) {
                System.out.println("Element found at index " + linearSearchResult + " (Linear Search)");
            } else {
                System.out.println("Element not found in the array (Linear Search)");
            }
        }
    }
        
       


