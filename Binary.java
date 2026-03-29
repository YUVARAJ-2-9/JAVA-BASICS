package BASICS;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int[] arr = new int[5];

        // 1. INPUT VAANGUROM
        System.out.println("Enter 5 values:");
        for (int i = 0; i < 5; i++) {
            arr[i] = n.nextInt();
        }

        // 2. BUBBLE SORT (Binary Search-ku array sorted-ah irukkanum!)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sorted Array-a oru vaati check pannuvom
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. BINARY SEARCH START
        System.out.println("Enter the number to search:");
        int target = n.nextInt();

        int low = 0;
        int high = 4;
        boolean found = false;

       

        while (low <= high) {
            int mid = (low + high) / 2; // Middle index kandupudikkirom

            if (arr[mid] == target) {
                System.out.println("Machi, Element found at index: " + mid);
                found = true;
                break; // Kidaichiduchi, loop-a thooku!
            } 
            else if (target > arr[mid]) {
                low = mid + 1; // Right side search pannu
            } 
            else {
                high = mid - 1; // Left side search pannu
            }
        }

        if (!found) {
            System.out.println("Not found machi! Vera number try pannu.");
        }
        
        n.close();
    }
}