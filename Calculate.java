import java.util.Scanner;
public class Calculat e {
    int[] arr;
    int comparisons = 0;
    public Calculate(int[] arr) {
        this.arr = arr;
    }

    public int findMin() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int findMax() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public void bubbleSort() {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
                comparisons++;
            }
            if (!swapped) {
                break;
            }
        }
    }

    public int linearSearch(int key) {
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; 
    }
    public int binarySearch(int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisons++;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
    public int getComparisons() {
        return comparisons;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Calculate calc = new Calculate(arr);
        calc.bubbleSort();
        System.out.println("Array after sorting: ");
        printArray(arr);
        System.out.println("\nMenu:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the element to search: ");
                int key = scanner.nextInt();
                int linearSearchResult = calc.linearSearch(key);
                if (linearSearchResult != -1) {
                    System.out.println("Element found at index " + linearSearchResult);
                } else {
                    System.out.println("Element not found");
                }
                System.out.println("Comparisons made during linear search: " + calc.getComparisons());
                break;
            case 2:
                System.out.print("Enter the element to search: ");
                key = scanner.nextInt();
                int binarySearchResult = calc.binarySearch(key);
                if (binarySearchResult != -1) {
                    System.out.println("Element found at index " + binarySearchResult);
                } else {
                    System.out.println("Element not found");
                }
                System.out.println("Comparisons made during binary search: " + calc.getComparisons());
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
