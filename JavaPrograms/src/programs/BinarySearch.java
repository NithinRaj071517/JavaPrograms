
package programs;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array1 = {1, 3, 4, 5, 7, 8, 9}; // sorted array
        int value = 8;

        int start = 0;
        int end = array1.length - 1;
        boolean found = false;

        for (; start <= end; ) {

            int middle = start + (end - start) / 2;

            if (array1[middle] == value) {
                found = true;
                break;
            } 
            else if (array1[middle] > value) {
                end = middle - 1;
            } 
            else {
                start = middle + 1;
            }
        }

        if (found) {
            System.out.println("found");
        } else {
            System.out.println("not");
        }
    }
}
