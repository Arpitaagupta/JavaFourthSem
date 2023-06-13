package JavaWithAbhii;

public class arrayDemo {
    public static void main(String[] args) {

        //An array is collection of similar types of data having contiguous memory allocation.
        //Java has no concept of pointers.

        //Indexing of arrays starts from zero i.e. first element will be stored at zeroth index, second
        //element at first index, third element at second index and so on.

        //The size of an array cannot be increased at runtime, therefore we can store only a fixed size
        //of element in arrays.

        //declare an array of integers

        int[] anArray;
        anArray = new int[5];  //declaration + memory allocation

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;

        System.out.println("Element at index 0 : " +anArray[0]);
        System.out.println("Element at index 1 : " +anArray[1]);
        System.out.println("Element at index 2 : " +anArray[2]);
        System.out.println("Element at index 3 : " +anArray[3]);
        System.out.println("Element at index 4 : " +anArray[4]);
    }
}
