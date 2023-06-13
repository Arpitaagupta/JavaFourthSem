package JavaWithAbhii;

public class array {
    public static void main(String[] args) {

        int[] arr1;  //array declaration
        arr1 = new int[5];   //memory allocation

        int arr2[] =  new int[3]; //array declaration + memory allocation
        arr2[0] = 11;
        arr2[1] = 8;
        arr2[2] =2003;


        int arr3[] = {1,2,3,4,5};  //array declaration + memory allocation + initialization

        //accessing array values
        System.out.println("Element at index 3 of array 3 : " +arr3[3]);
        System.out.println("Element at index 1 of array 2 : " +arr2[1]);

    }
}
