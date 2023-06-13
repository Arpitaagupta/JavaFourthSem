package Feb14;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int flag=0;
        int i;
        Integer arr[] = {2, 7, 9, 5, 67, 11, 23};
        System.out.println("Enter the number to be searched : ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for(i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println(key+" is found at index: "+i);
            }
            else {
               flag =1;
            }
        }
        if(flag==1){
            System.out.println("Element not found");
        }

    }

}

