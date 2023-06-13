package Feb14;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        binarySearch i = new binarySearch();
        int item[] = {2,1,5,3,6,0};
        Arrays.parallelSort(item);
        System.out.println("Sorted array = "+Arrays.toString(item));
        int loc = Arrays.binarySearch(item,5);
        System.out.println("Location of key is " +loc);
    }
}
